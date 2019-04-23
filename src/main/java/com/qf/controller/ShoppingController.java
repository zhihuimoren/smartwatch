package com.qf.controller;

import com.qf.service.ProductAppraiseService;
import com.qf.service.ProductService;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@RestController
public class ShoppingController {

    @Resource
    private ProductService productService;
    @Resource
    private ProductAppraiseService productAppraiseService;

    @RequestMapping("/shopping/findproductBuy")
    public Map findProductBuy(int productId){
        return productService.findProductBuy(productId);
    }

    @RequestMapping("/shopping/getAccGrade")
    public Map getAccGrade(int productClassId){
        return productAppraiseService.getAccGrade(productClassId);
    }

    @RequestMapping("/shopping/appraise")
    public List<Map> appraise(int productClassId){
        return productAppraiseService.appraise(productClassId);
    }

    @RequestMapping("/shopping/toBuyProducts")
    public R toBuyProducts(List<Map> productList ,int totalPrice){

        return productService.toBuyProducts(productList,totalPrice);
    }

}
