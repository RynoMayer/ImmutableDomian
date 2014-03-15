/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.config;

import com.ryno.tp.immutablewarehouseretailer.service.CRUD.AuthorCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl.AuthorCrudServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author ryno
 */
public class AppConfig {
    /*@Bean(name = "questionCrudService")
    public  QuestionCrudservice getQuestionCrudService(){
        return new QuestionCrudServiceImpl();
    }*/
    @Bean(name="authorCrudService")
    public AuthorCrudService getAuthorCrudService(){
        return new AuthorCrudServiceImpl();
    }
}
