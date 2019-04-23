package com.qf.service;


import java.util.List;
import java.util.Map;

public interface ProductAppraiseService {

    Map getAccGrade(int productClassId);

    List<Map> appraise(int productClassId);

}
