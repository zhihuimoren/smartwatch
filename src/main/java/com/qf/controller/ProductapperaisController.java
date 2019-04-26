package com.qf.controller;

import com.qf.DTD.ProductappraiseDto;
import com.qf.service.ProductappraisesService;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
@CrossOrigin("*")
@RestController
public class ProductapperaisController {
    @Resource
    private ProductappraisesService productappraiseService;
    @RequestMapping("/productappraise/insert")
    public R insert(@RequestBody ProductappraiseDto productappraise, HttpSession session){
        return productappraiseService.inser(productappraise,session);
    }
}
