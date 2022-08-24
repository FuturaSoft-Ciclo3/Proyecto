package com.futurasoft.proyecto;

public class MainApp {
    public static void main(String[] args) {
        // Ejemplo de la clase Empresa
        Empresa miEmpresa = new Empresa();
        miEmpresa.setNombre("Supermercado AhorraTodo");
        miEmpresa.setDireccion("carrera 2 # 4 - 56");
        miEmpresa.setTelefono("123456");
        miEmpresa.setNit("963852741");
        System.out.println("Clase Empresa");
        System.out.println("nombre: " + miEmpresa.getNombre());
        System.out.println("Dirección: " + miEmpresa.getDireccion());
        System.out.println("Teléfono: " + miEmpresa.getTelefono());
        System.out.println("NIT: " + miEmpresa.getNit());

        // Ejemplo de la clase Empleado
        Empleado miEmpleado = new Empleado();
        miEmpleado.setNombreEmpleado("Pedro Jimenez");
        miEmpleado.setEmailEmpleado("pedro@correo.com");
        miEmpleado.setEmpresa(miEmpresa);
        miEmpleado.setRolEmpleado("administrador");
        System.out.println("\nClase Empleado");
        System.out.println("Nombre: " + miEmpleado.getNombreEmpleado());
        System.out.println("Email: " + miEmpleado.getEmailEmpleado());
        System.out.println("Nombre Empresa: " + miEmpleado.getEmpresa().getNombre());
        System.out.println("Rol empleado: " + miEmpleado.getRolEmpleado());


        // Ejemplo de la clase MovimientoDinero
        MovimientoDinero md = new MovimientoDinero();
        md.setMontoMovimiento(-500);
        md.setConceptoMovimiento("pago factura");
        md.setUsuario(miEmpleado);
        System.out.println("\nClase MovimientoDinero");
        System.out.println("Monto movimiento: " + md.getMontoMovimiento());
        System.out.println("Concepto: " + md.getConceptoMovimiento());
        System.out.println("Nombre Empleado: " + md.getUsuario().getNombreEmpleado());
    }
}
