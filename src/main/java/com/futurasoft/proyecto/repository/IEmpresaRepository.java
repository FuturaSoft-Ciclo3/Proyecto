package com.futurasoft.proyecto.repository;

import com.futurasoft.proyecto.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query("SELECT e FROM Empresa e WHERE e.nit = ?1")
    ArrayList<Empresa> findByNit(String nit);

    @Query("SELECT e FROM Empresa e WHERE e.nombre = ?1")
    ArrayList<Empresa> findByName(String name);

}
