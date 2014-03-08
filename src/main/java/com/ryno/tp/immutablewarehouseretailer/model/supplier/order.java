/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.supplier;

/**
 *
 * @author ryno
 */
public final class order implements ManageOrder{
    private String descrip;
    private String barcode;
    private String Company;
    private String type;
    
    public String getDescrip(){
        return descrip;
    }
    public String getBarcode(){
        return barcode;
    }
    
    public String getCompany(){
        return Company;
    }
    public String getType(){
        return type;
    }
    
                       
    private order(Builder build){
        this.Company=build.Company;
        this.barcode=build.barcode;
        this.descrip=build.descrip;
        this.type=build.type;
    }
    
    public static class Builder{
        private String descrip;
        private String barcode;
        private String Company;
        private String type;
    
        public Builder(String descr, String bcode, String comp, String type){
            this.Company=comp;
            this.barcode=bcode;
            this.descrip=descr;
            this.type=type;
        }
        
        public order build(){
            return new order(this);
        }
        
        public Builder addOrder(Builder b){
            orderList.add((ManageOrder) b);
            return this;
        }
    }
}
