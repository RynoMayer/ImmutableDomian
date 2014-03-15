/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service.CRUD;


import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.service.crudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ryno
 */
public interface ManagerCrudService extends crudService <Manager, String>{
    
}
