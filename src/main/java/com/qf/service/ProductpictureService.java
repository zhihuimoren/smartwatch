package com.qf.service;

import com.qf.DTO.ProductpictureDTO;

import java.util.List;

public interface ProductpictureService {

    List<ProductpictureDTO> getCarousels(int type);

}
