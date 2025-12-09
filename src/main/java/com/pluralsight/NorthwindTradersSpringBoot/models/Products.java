package com.pluralsight.NorthwindTradersSpringBoot.models;

public class Products {
    private int productid;
    private String productName;
    private int categoryId;
    private double unitPrice;

    public Products() {
    }

    public Products(int productid, String productName, int categoryId, double unitPrice) {
        this.productid = productid;
        this.productName = productName;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
