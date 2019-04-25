package com.qf.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.DTD.CollectionEnity;
import com.qf.entity.ProductclassExample;
import com.qf.entity.Productcollection;
import com.qf.entity.ProductcollectionExample;
import com.qf.mapper.ProductcollectionMapper;
import com.qf.service.CollectionServer;
import com.qf.utils.Pager;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class CollectionServerImpl implements CollectionServer {

    @Resource
    private ProductcollectionMapper productcollectionMapper;


    @Override
    public R findAllById(String search, int offset, int limit , int type,int id) {

        PageHelper.startPage(offset,limit);

        List<CollectionEnity> allById = productcollectionMapper.findAllById(search, type, id);

        System.out.println(allById);

        PageInfo pageInfo =new PageInfo(allById);

        List list = pageInfo.getList();
        long total = pageInfo.getTotal();

        return R.ok().put("collectionlist",list).put("total",total);
    }

    @Override
    public R findCounts() {

        Map counts = productcollectionMapper.findCounts();

        return R.ok().put("Map",counts);

    }

    @Override
    public R insert(Productcollection productcollection) {


        int insert = productcollectionMapper.insertinto(productcollection);
        if (insert>0){

            return R.ok();
        }
        else {

            return R.error();
        }
    }

    @Override
    public R delete(List a) {

        ProductcollectionExample example=new ProductcollectionExample();

        ProductcollectionExample.Criteria criteria = example.createCriteria();

       criteria.andCollectionidIn(a);

        int i = productcollectionMapper.deleteByExample(example);

        return i>0? R.ok():R.error("没有数据");
    }


}
