package com.qf.controller;

import com.qf.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
@RestController
public class ShoppingController {


    @RequestMapping("/shopping/findproductBuy")
    public Map findProductBuy(int productId){
        return null;
    }

    @RequestMapping("/shopping/appraise")
    public List<Object> appraise(){
        return null;
    }

    @RequestMapping("/shopping/toBuyProducts")
    public R toBuyProducts(int productId,int productNum,int totalPrice){
        return null;
    }


}
