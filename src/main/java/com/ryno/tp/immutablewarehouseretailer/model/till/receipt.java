/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.till;

/**
 *
 * @author ryno
 */
public final class receipt implements register{
    private double total;
    private String descr;
    private double price;
    private int qty;
    
    public int getQty(){
        return qty;
    }
    public double getPrice(){
        return price;
    }
    public String getDescr(){
        return descr;
    }
    public double getTotal(){
        return total;
    }
    
    public void display(){
        System.out.println("Item: "+getDescr()+"\n");
        System.out.println("Quantity: "+getQty()+"\n");
        System.out.println("Price: "+getPrice()+"\n");
        System.out.println("Total: "+getTotal()+"\n");
    }
    
    private receipt(Builder build){
        this.total=build.total;
        this.descr=build.descr;
        this.price=build.price;
    }
    
    public static class Builder{
        private double total;
        private String descr;
        private double price;
        private int qty;
        
        public Builder(){
            
        }
        public Builder setPrice(double pr){
            this.price=pr;
            return this;
        }
        
        public Builder setDescr(String des){
            this.descr=des;
            return this;
        }
        public Builder setQty(int q){
            this.qty=q;
            return this;
        }
        public double calcTotal(){
            return this.price*this.qty;
        }
        
        public Builder setTotal(){
             double totals=calcTotal();
            this.total=totals;
            return this;
        
        }
        
        public receipt build(){
            return new receipt(this);
        }
    }
}
