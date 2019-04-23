package com.qf.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.DTO.Price;
import com.qf.entity.ProInfoType;
import com.qf.entity.ProInfoTypeExample;
import com.qf.entity.Productinfo;
import com.qf.entity.ProductinfoExample;
import com.qf.mapper.ProInfoTypeMapper;
import com.qf.mapper.ProductinfoMapper;
import com.qf.service.ProductService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.Sorter;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductinfoMapper productinfoMapper;

    @Resource
    private ProInfoTypeMapper proInfoTypeMapper;

    @Override
    public R getFun(Price price, int[] typeIds, Sorter sorter, String search, Pager pager) {
        ProInfoTypeExample example=new ProInfoTypeExample();
        ProInfoTypeExample.Criteria criteria = example.createCriteria();

        if (typeIds!=null){
        for (int typeId : typeIds) {
            criteria.andTypeidEqualTo(typeId);
        }}

        List<ProInfoType> proInfoTypes = proInfoTypeMapper.selectByExample(example);

        ProductinfoExample example1=new ProductinfoExample();
        ProductinfoExample.Criteria criteria1 = example1.createCriteria();
        if (price!=null) {
            if (price.getMaxPrice() != null && price.getMinPrice() != null) {
                criteria1.andProductpriceBetween( price.getMinPrice(),price.getMaxPrice());
            }
            if (price.getMaxPrice() != null && price.getMinPrice() == null) {
                criteria1.andProductpriceLessThan(price.getMaxPrice());
            }
            if (price.getMaxPrice() == null && price.getMinPrice() != null) {
                criteria1.andProductpriceGreaterThan(price.getMinPrice());
            }
        }
        if (search!=null){
            criteria1.andProductmsgLike("%"+search+"%");
        }
        if (sorter.getOrder()!=null&&sorter.getSort()!=null){
            example1.setOrderByClause(sorter.getSort()+" "+sorter.getOrder());
        }

        if (proInfoTypes.size() != 0) {
            for (ProInfoType proInfoType : proInfoTypes) {
                criteria1.andProductidEqualTo(proInfoType.getProductid());
            }
        }else {
            return R.error("此商品不存在");
        }


        List<Productinfo> productinfos = productinfoMapper.selectByExample(example1);

        List productList=new ArrayList();

        for (Productinfo productinfo : productinfos) {
            Map map = productinfoMapper.selePicById(productinfo.getProductid(),1);
            productList.add(map);
        }

        PageHelper.startPage(pager.getOffset(),pager.getLimit());
        PageInfo pageInfo=new PageInfo(productList);
        List list = pageInfo.getList();
        if (list.size()!=0)
        return R.ok().put("productList",list).put("totalPage",pageInfo.getPages());
        else
            return R.error("此商品不存在");
    }

    @Override
    public Map findProductBuy(int productId) {

        Map map = productinfoMapper.seleProductInfo(productId);

        List<Map> map1 = productinfoMapper.seleProductVersion(productId);

        map.put("productVersion",map1);

        return map;
    }

    @Override
    public R toBuyProducts(List<Map> productList, int totalPrice) {

        int priceAll=0;
        for (Map map : productList) {
            int productId = Integer.parseInt(map.get("productId")+"");
            Productinfo productinfo = productinfoMapper.selectByPrimaryKey(productId);
            priceAll +=productinfo.getProductprice().intValue()*Integer.parseInt(map.get("num")+"");
        }

        if (priceAll==totalPrice)
            return R.ok();
        else
        return R.error("支付失败");
    }


}
