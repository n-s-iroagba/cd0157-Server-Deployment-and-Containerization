package com.conbeve.product;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double price;
    private String category;
    private long quantity;
    private boolean hasSugar;
    private long vendorId;
    
    public void reduceQuantity(int removedQuantity){
        this.quantity-=removedQuantity;
    }
        
    
    public void addQuantity(int addedQuantity){
        this.quantity+=addedQuantity;
    }

    public void setName(String name){
        this.name=name;
        
    }  
    
    public void setPrice(int price){
        this.price=price;
        
    }  
    public void setCategory(String category){
        this.category=category;
        
    } 
    public void setSugar(boolean hasSugar){
        this.hasSugar=hasSugar; 
    }
}

