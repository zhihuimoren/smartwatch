package com.qf.controller;

import com.qf.entity.Productinfo;
import com.qf.service.ProductInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin("*")
@RestController
public class ProducrtInfoController {
    @Resource
    private ProductInfoService productInfoService;
    @RequestMapping("/productinfo/list")
    public List<Productinfo> list(){
        return productInfoService.list();
    }
}
