package com.qf.service;

import com.qf.utils.ResultData;
import com.qf.entity.Productinfo;
import java.util.List;
import java.util.Map;

public interface ProductInfoService {
    List<Map<String, Object>> ProductClassGetAll();

    List<Productinfo> list();
}

