package com.qf.service.impl;


import com.qf.entity.Productinfo;
import com.qf.mapper.ProductinfoMapper;
import com.qf.service.ProductInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Resource
    private ProductinfoMapper productinfoMapper;

    @Override
    public List<Productinfo> list() {


        return  productinfoMapper.findAllByid();
    }
}
