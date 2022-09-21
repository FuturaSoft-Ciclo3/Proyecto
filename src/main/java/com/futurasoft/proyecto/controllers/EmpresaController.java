package com.futurasoft.proyecto.controllers;

import com.futurasoft.proyecto.entities.Empresa;
import com.futurasoft.proyecto.services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpresaController {

    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    //El sistema devuelve responses 200 en la ruta enterprises con los siguientes verbos: GET
    @GetMapping("enterprises")
    public ArrayList<Empresa> getEmpresas() {
        return this.empresaService.getEmpresas();
    }

    //El sistema devuelve responses 200 en la ruta enterprises con los siguientes verbos: POST
    @PostMapping("enterprises")
    public String createEmpresa(Empresa data) {
        return this.empresaService.createEmpresa(data);
    }

    //El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos: GET
    @GetMapping("enterprises/{id}")
    public Empresa getEmpresa(@PathVariable long id) {
        return this.empresaService.getEmpresaById(id);
    }

    //El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos: PATCH
    @PatchMapping("enterprises/{id}")
    public String updateEmpresa(@RequestBody Empresa data) {
        return this.empresaService.updateEmpresa(data);
    }

    //El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos: DELETE
    @DeleteMapping("enterprises/{id}")
    public String deleteEmpresa(@PathVariable long id) {
        return this.empresaService.deleteEmpresa(id);
    }
}
