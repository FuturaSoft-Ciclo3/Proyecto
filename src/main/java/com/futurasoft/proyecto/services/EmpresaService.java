package com.futurasoft.proyecto.services;


import com.futurasoft.proyecto.entities.Empresa;
import com.futurasoft.proyecto.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    IEmpresaRepository empresaRepository;


    // Listar todas las empresas
    public ArrayList<Empresa> getEmpresas() {
        return (ArrayList<Empresa>) this.empresaRepository.findAll();
    }

    // Muestra una empresa
    public Empresa getEmpresaById(long id) {
        Optional<Empresa> empresa = this.empresaRepository.findById(id);
        return empresa.orElse(null);
    }

    // Crear una empresa
    public String createEmpresa(Empresa data) {
        ArrayList<Empresa> empresas = this.empresaRepository.findByNit(data.getNit());
        if (empresas != null && empresas.size() > 0) {
            return "El nit ya existe";
        }

        // comprobar nombre
        empresas = this.empresaRepository.findByName(data.getNombre());
        if (empresas != null && empresas.size() > 0) {
            return "El nombre de empresa ya existe";
        }

        this.empresaRepository.save(data);
        return "empresa agregada";

    }

    // Actualiza o modifica empresa
    public String updateEmpresa(Empresa data) {
        if (data.getId() == 0) {
            return "Error, el id de la empresa no es válido";
        }

        // validar si la empresa existe
        Empresa empresa = getEmpresaById(data.getId());
        if (empresa == null)
            return "Error, la empresa no existe";

        if (data.getTelefono() == null || data.getTelefono().equals(""))
            return "Error, el teléfono está vacío";

        if (data.getDireccion() == null || data.getDireccion().equals(""))
            return "Error, la dirección está vacía";

        empresa.setTelefono(data.getTelefono());
        empresa.setDireccion(data.getDireccion());
        //agregar aquí los otros campos que se requieren actualizar

        this.empresaRepository.save(empresa);

        return "empresa actualizada";
    }

    public String deleteEmpresa(long id) {
        try {
            this.empresaRepository.deleteById(id);
            return "empresa eliminada";
        } catch (Exception e) {
            return "Error" + e;
        }
    }

}
