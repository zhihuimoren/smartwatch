package com.qf.service.Impl;

import com.qf.entity.Producttype;
import com.qf.entity.ProducttypeExample;
import com.qf.mapper.ProducttypeMapper;
import com.qf.service.ProductTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Resource
    private ProducttypeMapper producttypeMapper;

    @Override
    public List<Object> getTypeAll() {

        ProducttypeExample example=new ProducttypeExample();

        ProducttypeExample.Criteria criteria = example.createCriteria();

        criteria.andParentidEqualTo(0);

        List<Producttype> producttypes = producttypeMapper.selectByExample(example);

        List<Object> list=new ArrayList<>();

        for (Producttype producttype : producttypes) {
            ProducttypeExample example2=new ProducttypeExample();
            ProducttypeExample.Criteria criteria2 = example2.createCriteria();
            Map map=new HashMap();
            map.put("type",producttype.getTypename());
            criteria2.andParentidEqualTo(producttype.getTypeid());
            List<Map> listType=new ArrayList<>();
            List<Producttype> producttypes1 = producttypeMapper.selectByExample(example2);
            for (Producttype producttype1 : producttypes1) {
                Map map1=new HashMap();
                map1.put("typeId",producttype1.getTypeid());
                map1.put("name",producttype1.getTypename());
                listType.add(map1);
            }
            map.put("list",listType);
            list.add(map);
        }

        return list;
    }
}
