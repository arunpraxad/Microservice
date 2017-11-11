package com.stock.db.stockdb.repository;

import com.stock.db.stockdb.model.Qoute;
import com.stock.db.stockdb.model.Qoutes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DbRepository extends JpaRepository<Qoute, Long> {

    List<Qoute> findByUserName(String username);

    void save(Qoutes qoute);
}
