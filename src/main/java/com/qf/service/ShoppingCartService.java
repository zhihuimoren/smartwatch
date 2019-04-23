package com.qf.service;

import com.qf.utils.R;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface ShoppingCartService {

    R saveCart(int productNum, int productId, HttpSession session);

    List<Map> getcart(HttpSession session);

    R delete(int[] productIds,HttpSession session);

}
