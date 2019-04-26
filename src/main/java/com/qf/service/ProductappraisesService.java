package com.qf.service;

import com.qf.DTD.ProductOrderDtd;

import com.qf.DTD.ProductappraiseDto;
import com.qf.utils.R;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface ProductappraisesService {
   R inser(ProductappraiseDto productappraise, HttpSession session);

   Map getAccGrade(int productClassId);

   List<Map> appraise(int productClassId);
}
