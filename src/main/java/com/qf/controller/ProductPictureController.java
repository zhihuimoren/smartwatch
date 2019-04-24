package com.qf.controller;


import com.qf.service.ProductpictureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class ProductPictureController {

    @Resource
    private ProductpictureService productPictureService;

    @RequestMapping("/select/picture")
    @ResponseBody
    public List<Map<String, Object>> picture() {
        return productPictureService.findProductPicture();
    }

    //热销
    @RequestMapping("/select/id")
    @ResponseBody
    public List<Map<String, Object>> id() {
        return productPictureService.findId();
    }

    //新品
    @RequestMapping("/select/ids")
    @ResponseBody
    public List<Map<String, Object>> ids() {
        return productPictureService.findId1();
    }

    //    配件
    @RequestMapping("/select/fittings")
    @ResponseBody
    public List<Map<String, Object>> fittings() {
        return productPictureService.findFittings();
    }
}
