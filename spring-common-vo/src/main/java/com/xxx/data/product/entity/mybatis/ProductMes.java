package com.xxx.data.product.entity.mybatis;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_product_mes")
public class ProductMes {
    @Id
    @Column(name = "c_product_id")
    private String productId;

    @Column(name = "c_product_name")
    private String productName;

    @Column(name = "c_product_introduction")
    private String productIntroduction;

    @Column(name = "c_product_owner_id")
    private String productOwnerId;

    @Column(name = "c_product_type_id")
    private String productTypeId;

    @Column(name = "c_product_creat_time")
    private Date productCreatTime;

    @Column(name = "c_product_creater")
    private String productCreater;

    @Column(name = "c_product_top_pic_list_id")
    private String productTopPicListId;

    @Column(name = "c_product_middle_pic_list_id")
    private String productMiddlePicListId;

    @Column(name = "c_product_details_page")
    private String productDetailsPage;

    @Column(name = "c_product_num")
    private Integer productNum;

    @Column(name = "c_product_price")
    private Double productPrice;

    @Column(name = "c_text1")
    private String text1;

    @Column(name = "c_text2")
    private String text2;

    /**
     * @return c_product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return c_product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return c_product_introduction
     */
    public String getProductIntroduction() {
        return productIntroduction;
    }

    /**
     * @param productIntroduction
     */
    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    /**
     * @return c_product_owner_id
     */
    public String getProductOwnerId() {
        return productOwnerId;
    }

    /**
     * @param productOwnerId
     */
    public void setProductOwnerId(String productOwnerId) {
        this.productOwnerId = productOwnerId;
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
     * @return c_product_creat_time
     */
    public Date getProductCreatTime() {
        return productCreatTime;
    }

    /**
     * @param productCreatTime
     */
    public void setProductCreatTime(Date productCreatTime) {
        this.productCreatTime = productCreatTime;
    }

    /**
     * @return c_product_creater
     */
    public String getProductCreater() {
        return productCreater;
    }

    /**
     * @param productCreater
     */
    public void setProductCreater(String productCreater) {
        this.productCreater = productCreater;
    }

    /**
     * @return c_product_top_pic_list_id
     */
    public String getProductTopPicListId() {
        return productTopPicListId;
    }

    /**
     * @param productTopPicListId
     */
    public void setProductTopPicListId(String productTopPicListId) {
        this.productTopPicListId = productTopPicListId;
    }

    /**
     * @return c_product_middle_pic_list_id
     */
    public String getProductMiddlePicListId() {
        return productMiddlePicListId;
    }

    /**
     * @param productMiddlePicListId
     */
    public void setProductMiddlePicListId(String productMiddlePicListId) {
        this.productMiddlePicListId = productMiddlePicListId;
    }

    /**
     * @return c_product_details_page
     */
    public String getProductDetailsPage() {
        return productDetailsPage;
    }

    /**
     * @param productDetailsPage
     */
    public void setProductDetailsPage(String productDetailsPage) {
        this.productDetailsPage = productDetailsPage;
    }

    /**
     * @return c_product_num
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * @param productNum
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * @return c_product_price
     */
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return c_text1
     */
    public String getText1() {
        return text1;
    }

    /**
     * @param text1
     */
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * @return c_text2
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }
}