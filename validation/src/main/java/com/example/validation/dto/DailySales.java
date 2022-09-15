package com.example.validation.dto;

import com.example.validation.annotation.YearMonthDay;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DailySales {
    @NotBlank(message = "date는 반드시 입력되어야 합니다.")
    @Size(min = 10, max = 10) // yyyy-mm-dd
    @YearMonthDay
    private String date;
    private int infoId;
    @Pattern(regexp = "^\\d{11}$", message = "vendorItemId의 양식과 맞지 않습니다.")
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
