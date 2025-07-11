package com.company.invoise.core.entity.invoice;


import com.company.invoise.core.entity.product.Product;
import jakarta.persistence.*;

@Entity
public class InvoiceLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Short quantity;
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCT")*/
    @Transient
    private Product product;

    private Long idProduct;

    public InvoiceLine() {
    }

    public InvoiceLine(Short quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
