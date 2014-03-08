/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.employees;

/**
 *
 * @author ryno
 */
public final class Stocker implements Employees{
        private String name;
    private double salary;
    private String employeeNum;
    
    public String getName(){
        return name;
    }
    public double returnSalary(){
        
        return salary;
    }
    public String getEmpNum(){
        return employeeNum;
    }
    
      private Stocker(Builder build){
        name=build.name;
        salary=build.salary;
        employeeNum=build.employeeNum;
    }
    
    public static class Builder{
        private String name;
        private double salary;
        private String employeeNum;
        
        public Builder(String name, String empN, double sal){
            this.name=name;
            this.employeeNum=empN;
            this.salary=sal;
        }
        
        public Builder setSalary(double sal){
            this.salary=sal;
            return this;
        }
        public Stocker Build(){
            return new Stocker(this);
        }
    }
}
