package com.qf.controller;

import com.qf.service.ShoppingCartService;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
@CrossOrigin("*")
@RestController
public class ShoppingCartController {

    @Resource
    private ShoppingCartService shoppingCartService;

    @RequestMapping("/shoppingCart/saveCart")
    public R saveCart(int productNum, int productId, HttpSession session){
        return shoppingCartService.saveCart(productNum,productId,session);
    }

    @RequestMapping("/shoppingCart/getcart")
    public List<Map> getcart(HttpSession session){
        return shoppingCartService.getcart(session);
    }

    @RequestMapping("/shoppingCart/changeNum")
    public R changeNum(List<Map> productCar){
        return null;
    }

    @RequestMapping("/shoppingCart/delete")
    public R delete(int[] productIds,HttpSession session){
        return shoppingCartService.delete(productIds,session);
    }

}
