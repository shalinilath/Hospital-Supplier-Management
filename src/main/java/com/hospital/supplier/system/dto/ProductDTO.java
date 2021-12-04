package com.hospital.supplier.system.dto;

import java.math.BigDecimal;

/**
 * @author Joe
 */

public class ProductDTO {
    private String id;
    private String product_id;
    private String product_name;
    private int units_available;
    private int units_required;
    private BigDecimal unit_price;

    public ProductDTO() {}


    public ProductDTO(String id, String product_id, String product_name, int units_available, int units_required,
                      BigDecimal unit_price) {
        this.id = id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.units_available = units_available;
        this.units_required = units_required;
        this.unit_price = unit_price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getUnits_available() {
        return units_available;
    }

    public void setUnits_available(int units_available) {
        this.units_available = units_available;
    }

    public int getUnits_required() {
        return units_required;
    }

    public void setUnits_required(int units_required) {
        this.units_required = units_required;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }
}
