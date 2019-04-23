package com.qf.controller;


import com.qf.entity.Productcollection;
import com.qf.entity.User;
import com.qf.service.CollectionServer;

import com.qf.utils.R;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@RestController
public class CollectionController {

    @Resource
    private CollectionServer collectionServer;


    @RequestMapping("/sys/collection/findAll")
    public R findAll(String search, @RequestParam(defaultValue = "1") int offset, @RequestParam(defaultValue = "10") int limit, String type, HttpSession httpSession) {


        User user = (User) httpSession.getAttribute("user");

        Integer userid = user.getUserid();
        int i=0;
        if(type!=null){

             i = Integer.parseInt(type);
        }


        R allById = collectionServer.findAllById(search, offset,limit, i, userid);

        return allById;

    }


    @RequestMapping("/sys/collection/concats")
    public R findCounts() {

        R counts = collectionServer.findCounts();

        return counts;
    }


    @RequestMapping("/sys/collection/insert")
    public R insert(Productcollection productcollection, HttpSession httpSession) {

       User user = (User) httpSession.getAttribute("user");

        Integer userid = user.getUserid();
        productcollection.setProductid(productcollection.getProductid());
        productcollection.setUserid(userid);
        R insert = collectionServer.insert(productcollection);

        return insert;
    }

    @RequestMapping("/sys/collection/delete")
    public  R delete(int[] collectionIds){


        List aa=new ArrayList();
        for (int collectionId : collectionIds) {
            aa.add(collectionId);
        }
        R delete = collectionServer.delete(aa);
        return delete;
    }


}