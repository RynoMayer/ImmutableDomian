/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.supplier;

/**
 *
 * @author ryno
 */
public final class supplier implements ManageOrder{
    private String Company;
    private String type;

    public String getCompany(){
        return Company;
    }
    public String getType(){
        return type;
    }
    
    private supplier(Builder build){
        Company=build.Company;
        type=build.type;
    }
    
    public static class Builder{
        private String Company;
        private String type;
        
        public Builder(String bcode, String comp){
            this.type=bcode;
            this.Company=comp;
        }
        
        
        public supplier build(){
            return new supplier(this);
        }
    }
}
