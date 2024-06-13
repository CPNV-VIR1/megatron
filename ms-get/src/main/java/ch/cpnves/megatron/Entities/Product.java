package ch.cpnves.megatron.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Product {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private double price;

    public Product(){}

    public Product(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

    public Long getID(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Product product))
            return false;
        return Objects.equals(this.id, product.id) && Objects.equals(this.name, product.name)
                && Objects.equals(this.price, product.price);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.price);
    }

    @Override
    public String toString(){
        return "Product{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}