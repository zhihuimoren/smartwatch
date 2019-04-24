package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Productorder;
import com.qf.service.ProductorderService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ProbuctOrderController {

    @Resource
    private ProductorderService productorderService;

    @RequestMapping("/probuctorder/list")
    public ResultData list(Integer pageNum, Integer pageSize,Integer orderStatus, HttpSession session){
            if (pageNum==null||pageNum<1){
                pageNum=1;
            }
           return productorderService.findPoBystatus(pageNum,pageSize,orderStatus,session);

        //return productorderService.findPoBystatus(pager,session);
    }
    @RequestMapping("/probuctorder/del/{orderId}")
    public R del(@PathVariable int orderId){
        return productorderService.del(orderId);
    }
    @RequestMapping("/probuctorder/update/{orderId}")
    public R update(@PathVariable int orderId){
        return productorderService.update(orderId);

    }
}
