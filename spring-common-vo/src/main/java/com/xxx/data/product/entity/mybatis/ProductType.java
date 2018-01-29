package com.xxx.data.product.entity.mybatis;

import javax.persistence.*;

@Table(name = "t_product_type")
public class ProductType {
    @Column(name = "ID")
    private String id;

    @Column(name = "c_product_type_id")
    private String productTypeId;

    @Column(name = "c_product_type_name")
    private String productTypeName;

    @Column(name = "c_product_type_parent_id")
    private String productTypeParentId;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return c_product_type_id
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    /**
     * @param productTypeId
     */
    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    /**
     * @return c_product_type_name
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * @param productTypeName
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    /**
     * @return c_product_type_parent_id
     */
    public String getProductTypeParentId() {
        return productTypeParentId;
    }

    /**
     * @param productTypeParentId
     */
    public void setProductTypeParentId(String productTypeParentId) {
        this.productTypeParentId = productTypeParentId;
    }
}