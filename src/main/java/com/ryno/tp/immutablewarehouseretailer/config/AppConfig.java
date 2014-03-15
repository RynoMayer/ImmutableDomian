/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.config;



import com.ryno.tp.immutablewarehouseretailer.service.CRUD.CashCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ItemCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ManagerCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.NotesCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.SupplierCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl.CashCrudServiceImpl;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl.ItemCrudServiceImpl;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl.ManagerCrudServiceImpl;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl.NotesCrudServiceImpl;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl.SupplierCrudServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author ryno
 */
public class AppConfig {
    
    @Bean(name = "ItemCrudService")
    public  ItemCrudService getItemCrudService(){
        return new ItemCrudServiceImpl();
    }
    @Bean(name="CashCrudService")
    public CashCrudService getCashCrudService(){
        return new CashCrudServiceImpl();
    }
    @Bean(name="ManagerCrudService")
    public ManagerCrudService getManagerCrudService(){
        return new ManagerCrudServiceImpl();
    }
    @Bean(name="NotesCrudService")
    public NotesCrudService getNotesCrudService(){
        return new NotesCrudServiceImpl();
    }
    @Bean(name="SupplierCrudService")
    public SupplierCrudService getSupplierCrudService(){
        return new SupplierCrudServiceImpl();
    }
}
