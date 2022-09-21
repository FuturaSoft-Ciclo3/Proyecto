package com.futurasoft.proyecto.repository;

import com.futurasoft.proyecto.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovimientoDineroRepository extends JpaRepository<Transaction, Long> {
}
