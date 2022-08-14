package com.conbeve.product;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GenerationType;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy="product.category")
    private ArrayList <Product> product=new ArrayList<Product>();
    private long productId;
    private long vendorId;
    
}