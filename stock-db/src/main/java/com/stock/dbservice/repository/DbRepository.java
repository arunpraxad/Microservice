package com.stock.dbservice.repository;

import com.stock.dbservice.model.Qoute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbRepository extends JpaRepository<Qoute, Long> {
}
