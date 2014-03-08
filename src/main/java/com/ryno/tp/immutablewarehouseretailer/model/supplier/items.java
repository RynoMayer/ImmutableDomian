/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.supplier;

/**
 *
 * @author ryno
 */
public final class items implements ManageOrder{
    private String descrip;
    private String barcode;
    
    public String getDescrip(){
        return descrip;
    }
    public String getBarcode(){
        return barcode;
    }
    
    private items(Builder build){
        barcode=build.barcode;
    }
    
    public static class Builder{
        private String descrip;
        private String barcode;
        
        public Builder(String bcode){
            this.barcode=bcode;
        }
        
        public Builder descrip(String dsc){
            this.descrip=dsc;
            return this;
        }
        
        public items build(){
            return new items(this);
        }
    }
}
