package com.futurasoft.proyecto.services;


import com.futurasoft.proyecto.repository.IEmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpresaService {

    private IEmpresaRepository empresaRepository;

    public EmpresaService(IEmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public ArrayList<Empresa> getAllCompanies(){

       ArrayList <Empresa> empresas = (ArrayList<Empresa>) empresaRepository.findAll();

       return empresas;

    }

    public Empresa getCompany(int id){

        if (empresaRepository.findById(id).isPresent()){
            return empresaRepository.findById(id).get();
        }

        return null;
    }

    public Response createCompany (Empresa data){

        Response response = new Response();

        if (empresaRepository.findByNit(data.getNit()).isPresent()){
            response.setCode(500);
            response.setMessage("La Empresa ya Existe");
            return response;
        }

        if(data.getNit().equals(null) || data.getNit().equals("")){
            response.setCode(500);
            response.setMessage("El valor nit es invalido");
            return response;

        }

        empresaRepository.save(data);
        response.setCode(200);
        response.setMessage("La empresa fue registrada exitosamente");

        return response;
    }

    public Response updateCompany (Empresa data){

        Response response = new Response();

        if (data.getNit().equals(null) || data.getNit().equals("")){

            response.setCode(500);
            response.setMessage("Se requiere el valor nit de la empresa para poder editar");
            return response;
        }

        Empresa empresa = empresaRepository.findByNit(data.getNit()).get();

        if (data.getNombre().length() > 0 ){

            empresa.setNombre(data.getNombre());

        }
        if (data.getDireccion().length() > 0 ){

            empresa.setDireccion(data.getDireccion());

        }
        if (data.getTelefono().length() > 0 ){

            empresa.setTelefono(data.getTelefono());

        }
        empresaRepository.save(empresa);
        response.setCode(200);
        response.setMessage("Se edito los datos e la empresa correctamente");


        return response;
    }

    public Response deleteCompany(String nit){

        Response response = new Response();

        if (!empresaRepository.findByNit(nit).isPresent()){
            response.setCode(500);
            response.setMessage("La empresa no existe");
            return response;

        }

        Empresa empresa = empresaRepository.findByNit(nit).get();


        empresaRepository.deleteById(empresa.getId());
        response.setCode(200);
        response.setMessage("Se elimino la empresa exitosamente");
        return response;


    }
}
