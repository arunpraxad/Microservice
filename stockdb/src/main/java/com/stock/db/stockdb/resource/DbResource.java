package com.stock.db.stockdb.resource;

import com.stock.db.stockdb.model.Qoute;
import com.stock.db.stockdb.model.Qoutes;
import com.stock.db.stockdb.repository.DbRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/rest/db")
public class DbResource {

    DbRepository dbRepository;

    public DbResource(DbRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    @GetMapping(value = "{username}")
    public List<String> getName(@PathVariable("username") final String username) {

        return dbRepository.findByUserName(username)
                .stream()
                .map(Qoute::getQoute)
                .collect(Collectors.toList());
    }

    @PostMapping(value = "/add")
    public List<String> addQoute(@PathVariable("qoutes") final Qoutes qoutes) {

        qoutes.getQoutes()
                .stream()
                .map(qoute -> new Qoutes(qoutes.getUserName(), (List<Qoute>) qoute))
                .forEach(qoute -> dbRepository.save(qoute));



        return dbRepository.findByUserName(qoutes.getUserName())
                .stream()
                .map(Qoute::getQoute)
                .collect(Collectors.toList());
    }
}
