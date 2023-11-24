package com.edu.iuh.fit.lab02.models;

import jakarta.persistence.*;

@Entity
public class ProductImage {
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    @Column(nullable = false)
    private String path;
    private String alternative;

    public Product getProduct() {
        return product;
    }

    public long getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public ProductImage() {
    }

    public ProductImage(Product product, long id, String path, String alternative) {
        this.product = product;
        this.id = id;
        this.path = path;
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "product=" + product +
                ", id=" + id +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}
