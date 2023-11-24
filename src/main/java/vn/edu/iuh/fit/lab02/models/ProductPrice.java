package com.edu.iuh.fit.lab02.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class ProductPrice {
    @Id
    @ManyToOne
    private Product product;
    @Id
    private LocalDateTime priceDateTime;
    private Double price;
    private String note;

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getPriceDateTime() {
        return priceDateTime;
    }

    public Double getPrice() {
        return price;
    }

    public String getNote() {
        return note;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPriceDateTime(LocalDateTime priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ProductPrice() {
    }

    public ProductPrice(Product product, LocalDateTime priceDateTime, Double price, String note) {
        this.product = product;
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
