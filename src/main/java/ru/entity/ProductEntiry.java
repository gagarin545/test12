package ru.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_item" , length = 6, nullable = false, columnDefinition = "serial")
    private long purchase_item;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "cost")
    private Float cost;

    public ProductEntiry() {}

    public long getPurchase_item() {        return purchase_item;    }
    public void setPurchase_item(long purchase_item) {        this.purchase_item = purchase_item;    }
    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    public Float getCost() {        return cost;    }
    public void setCost(Float cost) {        this.cost = cost;    }
}
