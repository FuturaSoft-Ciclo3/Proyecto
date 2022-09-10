package com.futurasoft.proyecto.controllers;

import com.futurasoft.proyecto.entities.Empleado;
import com.futurasoft.proyecto.services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpleadoController {

    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("users")
    public ArrayList<Empleado> getEmpleados(){
        return this.empleadoService.getEmpleados();
    }

    @PostMapping("users")
    public String createEmpleado(Empleado data){
        return this.empleadoService.createEmpleado(data);
    }

    @GetMapping("user/{id}")
    public Empleado getUsuario(@PathVariable int id){
        return this.empleadoService.getEmpleado(id);
    }

    @PatchMapping("user/{id}")
    public String updateEmpleado(@RequestBody Empleado data){
        return this.empleadoService.updateEmpleado(data);
    }

    @DeleteMapping("user/{id}")
    public String deleteempleado(@PathVariable int id){
        return this.empleadoService.deleteEmpleado(id);
    }
}
