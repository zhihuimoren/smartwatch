package com.qf.DTD;

import com.qf.entity.Productappraise;

import java.util.Date;

public class ProductappraiseDto extends Productappraise{
    private Date accessDate;
    private Integer productclass;

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    public Integer getProductclass() {
        return productclass;
    }

    public void setProductclass(Integer productclass) {
        this.productclass = productclass;
    }
}
