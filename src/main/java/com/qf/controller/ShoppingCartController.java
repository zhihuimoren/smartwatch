package com.qf.controller;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ShoppingCartController {

    @RequestMapping("/shoppingCart/saveCart")
    public R saveCart(int productNum,int productId,String versionName){

        return null;
    }

    @RequestMapping("/shoppingCart/getcart")
    public List<Object> getcart(int userId){

        return null;
    }

    @RequestMapping("/shoppingCart/changeNum")
    public R changeNum(int productId,int productNum){

        return null;
    }

    @RequestMapping("/shoppingCart/delete")
    public R delete(int productId){

        return null;
    }

    @RequestMapping("/shoppingCart/settleAccounts")
    public R settleAccounts(List productList,int totalPrice){
        return null;
    }

}
