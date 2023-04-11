/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Furniture {

    @Id
    private String id;
    private String name;
    private String price;
    private byte[] pictureBytes;
    private String vanessaId;
    private String style;
    private String type;

    public Furniture(String id, String name, String price, byte[] pictureBytes, String vanessaId, String style, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureBytes = pictureBytes;
        this.vanessaId = vanessaId;
        this.style = style;
        this.type = type;
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>price</tt>.
     *
     * @return property value of price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Setter method for property <tt>price</tt>.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Getter method for property <tt>pictureBytes</tt>.
     *
     * @return property value of pictureBytes
     */
    public byte[] getPictureBytes() {
        return pictureBytes;
    }

    /**
     * Setter method for property <tt>pictureBytes</tt>.
     *
     * @param pictureBytes value to be assigned to property pictureBytes
     */
    public void setPictureBytes(byte[] pictureBytes) {
        this.pictureBytes = pictureBytes;
    }

    /**
     * Getter method for property <tt>vanessaId</tt>.
     *
     * @return property value of vanessaId
     */
    public String getVanessaId() {
        return vanessaId;
    }

    /**
     * Setter method for property <tt>vanessaId</tt>.
     *
     * @param vanessaId value to be assigned to property vanessaId
     */
    public void setVanessaId(String vanessaId) {
        this.vanessaId = vanessaId;
    }

    /**
     * Getter method for property <tt>style</tt>.
     *
     * @return property value of style
     */
    public String getStyle() {
        return style;
    }

    /**
     * Setter method for property <tt>style</tt>.
     *
     * @param style value to be assigned to property style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }
}