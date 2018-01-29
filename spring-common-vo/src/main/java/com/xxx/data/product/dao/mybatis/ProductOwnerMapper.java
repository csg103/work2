package com.xxx.data.product.dao.mybatis;

import com.xxx.data.product.entity.mybatis.ProductOwner;
import com.xxx.data.product.entity.mybatis.ProductOwnerExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductOwnerMapper extends Mapper<ProductOwner> {
    long countByExample(ProductOwnerExample example);
}