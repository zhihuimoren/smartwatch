package com.qf.DTD;

import com.qf.entity.Productinfo;

public class ProductinfoDto extends Productinfo {

    private String pictureUrl;

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
