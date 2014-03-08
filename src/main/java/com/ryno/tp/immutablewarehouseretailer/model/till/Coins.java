/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.till;

/**
 *
 * @author ryno
 */
public final class Coins implements register{
    private int value;
    private String abbv;
    
    public int getValue(){
        return value;
    }
    public String getAbbv(){
        return abbv;
    }
    
    private Coins(Builder build){
        this.abbv=build.abbv;
        this.value=build.value;
    }
    
    public static class Builder{
        private int value;
        private String abbv;
        
        public Builder(String abbrev, int val){
            this.value=val;
            this.abbv=abbrev;
        }
        
        public Coins build(){
            return new Coins(this);
        }
        public Builder addCoins(Coins b){
            coinList.add(b);
            return this;
        }
    }
}
