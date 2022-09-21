package com.futurasoft.proyecto.repository;

import com.futurasoft.proyecto.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    @Query("SELECT u FROM Empleado u WHERE u.emailEmpleado = ?1")
    ArrayList<Empleado> existeCorreo(String correoElectronico);
}
