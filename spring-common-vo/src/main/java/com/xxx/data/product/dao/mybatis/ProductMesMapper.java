package com.xxx.data.product.dao.mybatis;

import com.xxx.data.product.entity.mybatis.ProductMes;
import com.xxx.data.product.entity.mybatis.ProductMesExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductMesMapper extends Mapper<ProductMes> {
    long countByExample(ProductMesExample example);
}