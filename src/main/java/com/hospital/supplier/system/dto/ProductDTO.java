package com.hospital.supplier.system.dto;

import java.math.BigDecimal;

/**
 * @author Joe
 */

public class ProductDTO {
    private String productId;
    private String vendorId;
    private String productName;
    private BigDecimal unitPrice;
    private String productDescription;

    public ProductDTO() {}

    public ProductDTO(String productId, String vendorId, String productName, BigDecimal unitPrice, String productDescription) {
        this.productId = productId;
        this.vendorId = vendorId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
