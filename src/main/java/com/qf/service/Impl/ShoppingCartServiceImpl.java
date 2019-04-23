package com.qf.service.Impl;

import com.qf.entity.Productshopping;
import com.qf.entity.ProductshoppingExample;
import com.qf.entity.User;
import com.qf.mapper.ProductshoppingMapper;
import com.qf.service.ShoppingCartService;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Resource
    private ProductshoppingMapper productshoppingMapper;

    @Override
    public R saveCart(int productNum, int productId,HttpSession session) {
        Productshopping productshopping=new Productshopping();
        productshopping.setProductid(productId);
        productshopping.setShoppingnumber(productNum);
        User user = (User)session.getAttribute("user");
        productshopping.setUserid(user.getUserid());
        int insert = productshoppingMapper.insert(productshopping);
        return insert>0?R.ok():R.error("添加失败");
    }

    @Override
    public List<Map> getcart(HttpSession session) {
        User user = (User)session.getAttribute("user");
        return productshoppingMapper.getcart(user.getUserid());
    }

    @Override
    public R delete(int[] productIds ,HttpSession session) {
        User user = (User)session.getAttribute("user");
        for (int productId : productIds) {
            ProductshoppingExample example=new ProductshoppingExample();
            ProductshoppingExample.Criteria criteria = example.createCriteria();
            criteria.andUseridEqualTo(user.getUserid());
            criteria.andProductidEqualTo(productId);
            int i = productshoppingMapper.deleteByExample(example);
            if (i<0)
                return R.error("删除失败"+productId);
        }
        return R.ok();
    }
}
