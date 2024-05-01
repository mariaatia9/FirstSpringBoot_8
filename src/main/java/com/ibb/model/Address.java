/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author trainer
 */
//@Setter
//@Getter
//@ToString
@Data
public class Address {
    
    private String city;
    private String street;

    public Address() {
    }
    
    

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }
    
    
    

   
    
    
    
    
}
