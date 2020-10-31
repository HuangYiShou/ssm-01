package com.qf.shou.ssm.service;

import com.qf.shou.ssm.entity.Product;
import com.qf.shou.ssm.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ProductServiceImpl implements ProductService{
   @Resource
   ProductMapper productMapper;

    @Override
    public Product getProduct(int productId) {
        Product product = productMapper.selectProduct(productId);
    return product;
    }
}
