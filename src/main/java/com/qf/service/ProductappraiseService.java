package com.qf.service;

import com.qf.DTD.ProductOrderDtd;

import com.qf.DTD.ProductappraiseDto;
import com.qf.utils.R;

import javax.servlet.http.HttpSession;

public interface ProductappraiseService {
   R inser(ProductappraiseDto productappraise, HttpSession session);
}
