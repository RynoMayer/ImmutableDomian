/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.transaction;

import com.ryno.tp.immutablewarehouseretailer.model.supplier.supplier;

/**
 *
 * @author ryno
 */
public class cash {
    private double amount;
    private String color;

    public double getAmount(){
        return amount;
    }
    public String getColor(){
        return color;
    }
    
    private cash(Builder build){
        amount=build.amount;
        color=build.color;
    }
    
    public static class Builder{
        private double amount;
        private String color;
        
        public Builder(double amt, String col){
            this.amount=amt;
            this.color=col;
        }
        
        
        public cash build(){
            return new cash(this);
        }
    }
}
