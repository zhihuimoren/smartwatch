package com.qf.service;


import com.qf.entity.Productcollection;
import com.qf.utils.Pager;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface CollectionServer {

    public R findAllById(String search, int offset,int limit, int type,int  userid);

    public  R findCounts();

    public  R insert(Productcollection productcollection);

    R delete(List a);
}
