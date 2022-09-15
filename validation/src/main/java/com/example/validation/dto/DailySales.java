package com.example.validation.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value=PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DailySales {
    private String date;
    private int infoId;
    private String vendorItemId;
    private int orderQuantity;
    private int netSales;
    private String updatedAt;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getVendorItemId() {
        return vendorItemId;
    }

    public void setVendorItemId(String vendorItemId) {
        this.vendorItemId = vendorItemId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getNetSales() {
        return netSales;
    }

    public void setNetSales(int netSales) {
        this.netSales = netSales;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
