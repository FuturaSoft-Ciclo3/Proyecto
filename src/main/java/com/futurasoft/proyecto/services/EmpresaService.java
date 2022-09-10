package com.futurasoft.proyecto.services;


import com.futurasoft.proyecto.entities.Empresa;
import com.futurasoft.proyecto.repository.IEmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpresaService {

    Empresa empresa;
    ArrayList<Empresa> empresas;

    public EmpresaService(){
        this.empresa = new Empresa();
    }

    public ArrayList<Empresa> listaEmpresas(){
        Empresa empresa1 = new Empresa();
        empresa1.setNombre("Calzado Superior");
        empresa1.setDireccion("calle 456 # 3 - 23");
        empresa1.setTelefono("741258");
        empresa1.setNit("987520");
        Empresa empresa2 = new Empresa();
        empresa2.setNombre("Ferreteria La Esquina");
        empresa2.setDireccion("calle 52 # 32 - 54");
        empresa2.setTelefono("741821");
        empresa2.setNit("99630");
        Empresa empresa3 = new Empresa();
        empresa3.setNombre("supermercado AhorraTodo");
        empresa3.setDireccion("carrera 14 # 18 - 54");
        empresa3.setTelefono("769858");
        empresa3.setNit("985424");
        empresas = new ArrayList<>();
        this.empresas.add(empresa1);
        this.empresas.add(empresa2);
        this.empresas.add(empresa3);
        return empresas;

    }

    public ArrayList<Empresa> getEmpresas(){
        return listaEmpresas();
    }

    public Empresa getEmpresa(int id){
        return listaEmpresas().get(id);
    }

    public String createEmpresa(Empresa data){
        this.empresas.add(data);
        return "empresa agregada";
    }

    public String updateEmpresa(Empresa data){
        for (int i = 0; i < listaEmpresas().size(); i++) {
            if(data.getNit().equals(listaEmpresas().get(i).getNit())){
                listaEmpresas().get(i).setNombre(data.getNombre());
                listaEmpresas().get(i).setDireccion(data.getDireccion());
                listaEmpresas().get(i).setTelefono(data.getTelefono());
                listaEmpresas().get(i).setNit(data.getNit());
            }
        }
        return "empresa actualizada";
    }

    public String deleteEmpresa(int id){
        listaEmpresas().remove(id);
        return "empresa eliminada";
    }









}
