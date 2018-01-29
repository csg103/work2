package com.xxx.data.product.dao.mybatis;

import com.xxx.data.product.entity.mybatis.ProductPicList;
import com.xxx.data.product.entity.mybatis.ProductPicListExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductPicListMapper extends Mapper<ProductPicList> {
    long countByExample(ProductPicListExample example);
}