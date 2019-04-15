package com.qf.service.Impl;

import com.qf.DTO.ProductpictureDTO;
import com.qf.entity.ProductpictureExample;
import com.qf.mapper.ProductinfoMapper;
import com.qf.mapper.ProductpictureMapper;
import com.qf.service.ProductpictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductpictureServiceImpl implements ProductpictureService {

    @Resource
    private ProductpictureMapper pictureMapper;

    @Override
    public List<ProductpictureDTO> getCarousels(int type) {
        return pictureMapper.selectByType(type);
    }



}
