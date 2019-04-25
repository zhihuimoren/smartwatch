package com.qf.service;

import com.qf.DTD.Price;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.Sorter;

import java.util.List;
import java.util.Map;

public interface ProductService {

    R getFun(Price price, int[] typeIds, Sorter sorter, String search, Pager pager);

    Map findProductBuy(int productId);

    R toBuyProducts(List<Map> productList , int totalPrice);
}
