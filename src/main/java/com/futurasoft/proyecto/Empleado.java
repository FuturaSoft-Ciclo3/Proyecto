package com.futurasoft.proyecto;

public class Empleado {

    private String nombreEmpleado;
    private String emailEmpleado;
    private Empresa empresa;
    private String rolEmpleado;


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        if (rolEmpleado.equals("administrador")) {
            this.rolEmpleado = "administrador";
        } else if (rolEmpleado.equals("operativo")) {
            this.rolEmpleado = "operativo";
        }
    }
}
