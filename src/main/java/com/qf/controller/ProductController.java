package com.qf.controller;
import com.qf.DTO.Price;
import com.qf.DTO.ProductpictureDTO;
import com.qf.service.ProductService;
import com.qf.service.ProductTypeService;
import com.qf.service.ProductpictureService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.Sorter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    @Resource
    private ProductpictureService productpictureService;

    @Resource
    private ProductTypeService productTypeService;

    @Resource
    private ProductService productService;

    @RequestMapping("/product/getcarousels")
    public List<ProductpictureDTO> getCarousels(){
        return productpictureService.getCarousels(2);
    }


    @RequestMapping("/product/getTypeAll")
    public List<Object> getTypeAll(){
        return productTypeService.getTypeAll();
    }

    @RequestMapping("/product/getFun")
    public R getFun(Price price, int[] typeIds, Sorter sorter, String search, Pager pager){

        return productService.getFun(price,typeIds,sorter,search,pager);
    }



}
