package com.qf.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.Productorder;
import com.qf.entity.User;
import com.qf.mapper.ProductorderMapper;

import com.qf.service.ProductorderService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Service
public class productorderServiceImpl implements ProductorderService{
    @Resource
    private ProductorderMapper productorderMapper;

    @Override
    public ResultData findPoBystatus(Integer pageNum, Integer pageSize,Integer orderStatus, HttpSession session) {

       // PageHelper.offsetPage(pageNum,pageSize);
        PageHelper.startPage(pageNum,pageSize);
        User user = (User) session.getAttribute("user");
         int userId=user.getUserid();
        List<Productorder> list = productorderMapper.findPoBystatus(orderStatus,userId);



        PageInfo info = new PageInfo(list);

       // List list1 = info.getList();


        ResultData resultData = new ResultData(info.getTotal(),info.getList());
        return resultData;
    }

    @Override
    public R del(int orderId) {
        int i = productorderMapper.deleteByPrimaryKey(orderId);
        return i>0?R.ok():R.error();
    }

    @Override
    public R update(int orderId) {
       int i = productorderMapper.poUpdate(orderId);

        return i>0?R.ok():R.error();
    }
}
