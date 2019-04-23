package com.qf.service.Impl;

import com.qf.mapper.ProductappraiseMapper;
import com.qf.service.ProductAppraiseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;

@Service
public class ProductAppraiseServiceImpl implements ProductAppraiseService {

    @Resource
    private ProductappraiseMapper productappraiseMapper;

    @Override
    public Map getAccGrade(int productClassId) {
        Map map = productappraiseMapper.seleAccGrade(productClassId);
        float num = (float) Integer.parseInt(map.get("goodNum")+"")/Integer.parseInt(map.get("totalNum")+"");
        DecimalFormat df = new DecimalFormat("0.00");
        String s = df.format(num);
        NumberFormat nf = NumberFormat.getPercentInstance();
        map.put("goodGrade",nf.format(Double.parseDouble(s)));
        return map;
    }

    @Override
    public List<Map> appraise(int productClassId) {
        return productappraiseMapper.seleAccess(productClassId);
    }
}
