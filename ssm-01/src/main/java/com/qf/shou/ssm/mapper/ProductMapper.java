package com.qf.shou.ssm.mapper;

import com.qf.shou.ssm.entity.Product;
import org.apache.ibatis.annotations.Param;



public interface ProductMapper {
    Product selectProduct(@Param("productId") int productId );


}
