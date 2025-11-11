package com.adminPanel.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="product" )
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)  // "orphanRemoval = true" to delete old details from database in update case
    @JoinColumn(name = "product_details_id")
    private ProductDetails productDetails;

}
