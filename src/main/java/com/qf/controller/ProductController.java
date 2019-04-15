package com.qf.controller;
import com.qf.DTO.ProductpictureDTO;
import com.qf.service.ProductpictureService;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    @Resource
    private ProductpictureService productpictureService;

    @RequestMapping("/product/getcarousels")
    public List<ProductpictureDTO> getCarousels(){
        return productpictureService.getCarousels(2);
    }


    @RequestMapping("/product/getTypeAll")
    public List<Object> getTypeAll(){

        return null;
    }

    @RequestMapping("/product/getFun")
    public R getFun(){

        return null;
    }

}
