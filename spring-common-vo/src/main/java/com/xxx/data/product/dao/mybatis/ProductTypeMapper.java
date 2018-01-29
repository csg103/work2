package com.xxx.data.product.dao.mybatis;

import com.xxx.data.product.entity.mybatis.ProductType;
import com.xxx.data.product.entity.mybatis.ProductTypeExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductTypeMapper extends Mapper<ProductType> {
    long countByExample(ProductTypeExample example);
}