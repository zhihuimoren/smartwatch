package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Productorder;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;

import javax.servlet.http.HttpSession;

public interface ProductorderService {
    ResultData findPoBystatus(Integer pageNum, Integer pageSize,Integer orderStatus, HttpSession session);
    R del(int orderId);
    R update(int orderId);



}
