/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.product;

/**
 *
 * @author ryno
 */
public class sportware implements IProduct{
    private String barcode;
    private String descrip;
    private String brand;
    
    public String Types(){
        return "sportware";
    }
    
    public String getBarcode(){
        return barcode;
    }
    public String getDescrip(){
        return descrip;
    }
    public String getBrand(){
        return brand;
    }
    
    private sportware(Builder build){
        barcode=build.barcode;
    }
    
    public static class Builder{
        private String barcode;
        private String descrip;
        private String brand;    
    
        public Builder(String bcode){
            this.barcode=bcode;
        }
        
        public Builder descrip(String descr){
            descrip=descr;
            return this;
        }
        
        public Builder brand(String br){
            brand=br;
            return this;
        }
        
        public sportware Build(){
            return new sportware(this);
        }
    }
}
