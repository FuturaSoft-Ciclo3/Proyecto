package com.futurasoft.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,Integer> {

    @Query("SELECT e FROM Empresa e WHERE e.nit = ?1")
    Optional<Empresa> findByNit(String nit);


}
