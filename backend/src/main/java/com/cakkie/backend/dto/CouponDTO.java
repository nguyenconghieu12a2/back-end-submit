package com.cakkie.backend.dto;

import java.util.Date;

public class CouponDTO {
    private int id;
    private String code;
    private String name;
    private int quantity;
    private long priceDiscount;
    private Date startDate;
    private Date endDate;
    private int isDeleted;


    public CouponDTO(int id, String code, String name, int quantity, long priceDiscount, Date startDate, Date endDate, int isDeleted) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.priceDiscount = priceDiscount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getPriceDiscount() {
        return priceDiscount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getIsDeleted() {
        return isDeleted;
    }
}
