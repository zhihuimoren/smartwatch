package com.qf.service;

import com.qf.DTD.ProductpictureDTO;

import java.util.List;
import java.util.Map;

public interface ProductpictureService {

    List<ProductpictureDTO> getCarousels(int type);



    List<Map<String,Object>> findProductPicture();
    List<Map<String,Object>> findId();
    List<Map<String,Object>> findId1();
    List<Map<String,Object>> findFittings();
}
