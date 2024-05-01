/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.conf;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author trainer
 */
//@Profile(value = "meins")
@Configuration
public class MeinsConfiguration {

    @Value(value = "${myValue}")
    private String text;
    
    
    
    public MeinsConfiguration() {
        System.out.println("Meins Configuration aufgerufen mit dem meinValue:"+text);
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Meins Configuration aufgerufen mit dem meinValue: " + text);
    }
    
    
}
