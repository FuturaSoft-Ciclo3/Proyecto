package com.futurasoft.proyecto.services;

import com.futurasoft.proyecto.entities.Empleado;
import com.futurasoft.proyecto.entities.Empresa;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class EmpleadoService {

    Empleado empleado;
    Empresa empresa;
    ArrayList<Empleado> empleados;

    public EmpleadoService() {
        this.empleado = new Empleado();
        this.empresa = new Empresa();
    }



    public ArrayList<Empleado> listaEmpleados() {
        Empleado empleado1 = new Empleado();
        empleado1.setNombreEmpleado("pepito perez");
        empleado1.setEmailEmpleado("pepito@correo.com");
        empleado1.setEmpresa(this.empresa);
        empleado1.setRolEmpleado("administrador");
        Empleado empleado2 = new Empleado();
        empleado2.setNombreEmpleado("juan perez");
        empleado2.setEmailEmpleado("juan@correo.com");
        empleado2.setEmpresa(this.empresa);
        empleado2.setRolEmpleado("operativo");
        Empleado empleado3 = new Empleado();
        empleado3.setNombreEmpleado("carlos fayad");
        empleado3.setEmailEmpleado("carlos@correo.com");
        empleado3.setEmpresa(this.empresa);
        empleado3.setRolEmpleado("operativo");
        empleados = new ArrayList<>();
        this.empleados.add(empleado1);
        this.empleados.add(empleado2);
        this.empleados.add(empleado3);
        return empleados;
    }

    public ArrayList<Empleado> getEmpleados(){
        return listaEmpleados();
    }
    public Empleado getEmpleado(int id) {
        return listaEmpleados().get(id);
    }

    public String createEmpleado(Empleado data) {
        this.empleados.add(data);
        //listaEmpleados().add(data);
        return "empleado agregado";
    }

    public String updateEmpleado(Empleado data){
        for (int i = 0; i < listaEmpleados().size(); i++) {
            if(data.getEmailEmpleado().equals(listaEmpleados().get(i).getEmailEmpleado())){
                listaEmpleados().get(i).setNombreEmpleado(data.getNombreEmpleado());
                listaEmpleados().get(i).setEmailEmpleado(data.getEmailEmpleado());
                listaEmpleados().get(i).setEmpresa(data.getEmpresa());
                listaEmpleados().get(i).setRolEmpleado(data.getRolEmpleado());
            }
        }
        return "empleado actualizado";
    }

    public String deleteEmpleado(int id){
        listaEmpleados().remove(id);
        return "empleado eliminado";
    }
}
