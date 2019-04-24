package com.qf.service.impl;

import com.qf.DTD.ProductappraiseDto;
import com.qf.entity.Productappraise;
import com.qf.entity.User;
import com.qf.mapper.ProductappraiseMapper;
import com.qf.service.ProductappraiseService;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class ProductappraiseServiceImpl implements ProductappraiseService {
    @Resource
    private ProductappraiseMapper productappraiseMapper;

    @Override
    public R inser(ProductappraiseDto productappraise, HttpSession session) {
        User user = (User) session.getAttribute("user");
        int userId=user.getUserid();
        productappraise.setUserid(userId);
        int i = productappraiseMapper.addproductAppraiseDto(productappraise);

        return i>0?R.ok():R.error();
    }
}
