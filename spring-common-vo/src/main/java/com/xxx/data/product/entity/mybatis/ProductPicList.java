package com.xxx.data.product.entity.mybatis;

import javax.persistence.*;

@Table(name = "t_product_pic_list")
public class ProductPicList {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "c_product_pic_list_id")
    private String productPicListId;

    @Column(name = "c_product_pic_url")
    private String productPicUrl;

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
     * @return c_product_pic_list_id
     */
    public String getProductPicListId() {
        return productPicListId;
    }

    /**
     * @param productPicListId
     */
    public void setProductPicListId(String productPicListId) {
        this.productPicListId = productPicListId;
    }

    /**
     * @return c_product_pic_url
     */
    public String getProductPicUrl() {
        return productPicUrl;
    }

    /**
     * @param productPicUrl
     */
    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }
}