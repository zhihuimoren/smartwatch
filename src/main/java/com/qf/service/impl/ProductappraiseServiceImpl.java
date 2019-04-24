package com.qf.service.impl;

import com.qf.DTD.ProductappraiseDto;
import com.qf.entity.Productappraise;
import com.qf.entity.User;
import com.qf.mapper.ProductappraiseMapper;
import com.qf.service.ProductappraiseService;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;

@Service
public class ProductappraiseServiceImpl implements ProductappraiseService {
    @Resource
    private ProductappraiseMapper productappraiseMapper;

    @Override
    public R inser(ProductappraiseDto productappraise, HttpSession session) {
        User user = (User) session.getAttribute("user");
        String username=user.getUsername();
        productappraise.setUsername(username);
        int i = productappraiseMapper.addproductAppraiseDto(productappraise);

        return i>0?R.ok():R.error();
    }

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
