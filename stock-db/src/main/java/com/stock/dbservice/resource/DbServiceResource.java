package com.stock.dbservice.resource;

import com.stock.dbservice.model.Qoute;
import com.stock.dbservice.repository.DbRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbServiceResource {

    DbRepository dbRepository;

    public DbRepository getDbRepository() {
        return dbRepository;
    }

    @GetMapping(value = "/test")
    String getTest() {
        return "test";
    }

    @GetMapping(value = "/all")
    List<Qoute> getAllQoutes() {
        return dbRepository.findAll();
    }
}
