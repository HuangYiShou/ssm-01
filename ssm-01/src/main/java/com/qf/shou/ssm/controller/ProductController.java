package com.qf.shou.ssm.controller;

import com.qf.shou.ssm.entity.Product;
import com.qf.shou.ssm.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;
    @GetMapping("/id")
    public Product id(int productId ){
        System.out.println(productId);
        Product product = productService.getProduct(productId);
        return product;

    }

}
