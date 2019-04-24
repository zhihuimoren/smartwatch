package com.qf.service.Impl;

import com.qf.DTD.ProductClassInfo;
import com.qf.entity.Productinfo;
import com.qf.mapper.ProductinfoMapper;
import com.qf.service.ProductInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class ProductInfoImpl implements ProductInfoService {

    @Resource
    private ProductinfoMapper productinfoMapper;

    @Override
    public List<Map<String,Object>> ProductClassGetAll() {
        List<ProductClassInfo> list= productinfoMapper.ProductClassGetAll();
        List<ProductClassInfo> list1= productinfoMapper.ProductClassGetAll1();
        List<ProductClassInfo> list2= productinfoMapper.ProductClassGetAll2();
        List<ProductClassInfo> list3= productinfoMapper.ProductClassGetAll3();
        List<Map<String,Object>> linkedList = new LinkedList<>();

        List<Map<String,Object>> list4=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        for (ProductClassInfo productClassInfo : list) {
            map.put("type",list.get(0).getType());
            map.put("product",list);
        }
        Map<String,Object> map1=new HashMap<>();
        for (ProductClassInfo productClassInfo : list) {
            map1.put("type",list1.get(0).getType());
            map1.put("product",list1);
        }
        Map<String,Object> map2=new HashMap<>();
        for (ProductClassInfo productClassInfo : list) {
            map2.put("type",list2.get(0).getType());
            map2.put("product",list2);
        }
        Map<String,Object> map3=new HashMap<>();
        for (ProductClassInfo productClassInfo : list) {
            map3.put("type",list3.get(0).getType());
            map3.put("product",list3);
        }

        linkedList.add(map);
        linkedList.add(map1);
        linkedList.add(map2);
        linkedList.add(map3);

        return linkedList;
    }

    @Override
    public List<Productinfo> list() {


        return  productinfoMapper.findAllByid();
    }


}
