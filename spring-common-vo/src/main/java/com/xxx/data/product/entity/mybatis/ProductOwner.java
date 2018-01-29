package com.xxx.data.product.entity.mybatis;

import javax.persistence.*;

@Table(name = "t_product_owner")
public class ProductOwner {
    @Column(name = "c_ower_Id")
    private String owerId;

    @Column(name = "c_ower_name")
    private String owerName;

    @Column(name = "c_ower_descri")
    private String owerDescri;

    @Column(name = "c_ower_sex")
    private String owerSex;

    @Column(name = "c_ower_tel")
    private String owerTel;

    @Column(name = "c_ower_address")
    private String owerAddress;

    @Column(name = "c_ower_mail")
    private String owerMail;

    @Column(name = "c_text1")
    private String text1;

    @Column(name = "c_text2")
    private String text2;

    /**
     * @return c_ower_Id
     */
    public String getOwerId() {
        return owerId;
    }

    /**
     * @param owerId
     */
    public void setOwerId(String owerId) {
        this.owerId = owerId;
    }

    /**
     * @return c_ower_name
     */
    public String getOwerName() {
        return owerName;
    }

    /**
     * @param owerName
     */
    public void setOwerName(String owerName) {
        this.owerName = owerName;
    }

    /**
     * @return c_ower_descri
     */
    public String getOwerDescri() {
        return owerDescri;
    }

    /**
     * @param owerDescri
     */
    public void setOwerDescri(String owerDescri) {
        this.owerDescri = owerDescri;
    }

    /**
     * @return c_ower_sex
     */
    public String getOwerSex() {
        return owerSex;
    }

    /**
     * @param owerSex
     */
    public void setOwerSex(String owerSex) {
        this.owerSex = owerSex;
    }

    /**
     * @return c_ower_tel
     */
    public String getOwerTel() {
        return owerTel;
    }

    /**
     * @param owerTel
     */
    public void setOwerTel(String owerTel) {
        this.owerTel = owerTel;
    }

    /**
     * @return c_ower_address
     */
    public String getOwerAddress() {
        return owerAddress;
    }

    /**
     * @param owerAddress
     */
    public void setOwerAddress(String owerAddress) {
        this.owerAddress = owerAddress;
    }

    /**
     * @return c_ower_mail
     */
    public String getOwerMail() {
        return owerMail;
    }

    /**
     * @param owerMail
     */
    public void setOwerMail(String owerMail) {
        this.owerMail = owerMail;
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