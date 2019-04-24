package com.qf.controller;


import com.qf.service.ProductInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class ProductClassController {


    @Resource
    private ProductInfoService productInfoService;

    @RequestMapping("/select/productinfos")
    public List<Map<String,Object>> productinfos(){
        return  productInfoService.ProductClassGetAll();
    }

}
