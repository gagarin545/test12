package ru.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name= "pay")
public class PayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false, columnDefinition = "serial")
    private long id;
    @Getter
    @Setter
    @Column(name = "count")
    private  Integer count;
    @Getter
    @Setter
    @Column( name = "purchase_date", nullable = false )
    private Timestamp purchase_date;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "purchase_item", nullable = false)
    private ProductEntiry productEntiry;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idperson", nullable = false)
    private PersonEntity personEntity;

    public PayEntity() {}

    public long getId() {        return id;    }
    public ProductEntiry getProductEntiry() {        return productEntiry;    }
    public void setProductEntiry(ProductEntiry productEntiry) {        this.productEntiry = productEntiry;    }
    public PersonEntity getPersonEntity() {        return personEntity;    }
    public void setPersonEntity(PersonEntity personEntity) {        this.personEntity = personEntity;    }
}