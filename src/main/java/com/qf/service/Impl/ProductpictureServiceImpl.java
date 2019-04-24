package com.qf.service.Impl;

import com.qf.DTD.ProductInfoPicture;
import com.qf.DTO.ProductpictureDTO;
import com.qf.entity.Productclass;
import com.qf.entity.Productpicture;

import com.qf.mapper.ProductpictureMapper;
import com.qf.service.ProductpictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class ProductpictureServiceImpl implements ProductpictureService {

    @Resource
    private ProductpictureMapper pictureMapper;

    @Override
    public List<ProductpictureDTO> getCarousels(int type) {
        return pictureMapper.selectByType(type);
    }



    @Override
    public List<Map<String, Object>> findProductPicture() {
        List<Productpicture> list = pictureMapper.findPicture();
        List<Map<String, Object>> linkedList = new LinkedList<>();
        for (Productpicture productpicture : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("pictureurl", productpicture.getPictureurl());
            map.put("productid", productpicture.getProductid());
            linkedList.add(map);

        }
        return linkedList;
    }

    //    热销
    @Override
    public List<Map<String, Object>> findId() {
        List<Productclass> list = pictureMapper.findId();
        List<Map<String, Object>> linkedList = new LinkedList<>();
        for (Productclass productclass : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("productClassName", productclass.getProductclassname());
            List<ProductInfoPicture> productSales = pictureMapper.findProductSales(productclass.getProductclassid());
            map.put("product", productSales);
            linkedList.add(map);
        }
        return linkedList;
    }

    //新品
    public List<Map<String, Object>> findId1() {
        List<Productclass> list = pictureMapper.findId();
        List<Map<String, Object>> linkedList = new LinkedList<>();
        for (Productclass productclass : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("productClassName", productclass.getProductclassname());
            List<ProductInfoPicture> productSales = pictureMapper.findProductSales1(productclass.getProductclassid());
            map.put("product", productSales);
            linkedList.add(map);
        }
        return linkedList;
    }

    @Override
    public List<Map<String, Object>> findFittings() {
        List<ProductInfoPicture> list = pictureMapper.findFittings();
        List<Map<String, Object>> linkedList = new LinkedList<>();
        for (ProductInfoPicture productInfoPicture : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("productName",productInfoPicture.getProductname());
            map.put("productMsg",productInfoPicture.getProductmsg());
            map.put("productPrice",productInfoPicture.getProductprice());
            map.put("productUrl",productInfoPicture.getPictureurl());
            linkedList.add(map);
        }
        return linkedList;
    }

}
