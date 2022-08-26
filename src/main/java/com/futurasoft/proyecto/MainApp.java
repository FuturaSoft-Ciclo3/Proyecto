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
        System.out.println();
        Empresa otraEmpresa = new Empresa();
        otraEmpresa.setNombre("Calzado Superior");
        otraEmpresa.setDireccion("calle 5 # 8 - 34");
        otraEmpresa.setTelefono("987654");
        otraEmpresa.setNit("147258369");
        System.out.println("Clase Empresa");
        System.out.println("nombre: " + otraEmpresa.getNombre());
        System.out.println("Dirección: " + otraEmpresa.getDireccion());
        System.out.println("Teléfono: " + otraEmpresa.getTelefono());
        System.out.println("NIT: " + otraEmpresa.getNit());

        // Ejemplo de la clase Empleado
        Empleado miEmpleado = new Empleado();
        miEmpleado.setNombreEmpleado("Pedro Jimenez");
        miEmpleado.setEmailEmpleado("pedro@correo.com");
        miEmpleado.setEmpresa(miEmpresa);
        miEmpleado.setRolEmpleado("administrador");
        System.out.println("\nClase Empleado");
        System.out.println("Nombre: " + miEmpleado.getNombreEmpleado());
        System.out.println("Email: " + miEmpleado.getEmailEmpleado());
        System.out.println("Empresa: " + miEmpleado.getEmpresa().getNombre());
        System.out.println("Rol empleado: " + miEmpleado.getRolEmpleado());
        System.out.println();
        Empleado otroEmpleado = new Empleado();
        otroEmpleado.setNombreEmpleado("Pepito Perez");
        otroEmpleado.setEmailEmpleado("pepito@correo.com");
        otroEmpleado.setEmpresa(miEmpresa);
        otroEmpleado.setRolEmpleado("operativo");
        System.out.println("\nClase Empleado");
        System.out.println("Nombre: " + otroEmpleado.getNombreEmpleado());
        System.out.println("Email: " + otroEmpleado.getEmailEmpleado());
        System.out.println("Empresa: " + otroEmpleado.getEmpresa().getNombre());
        System.out.println("Rol empleado: " + otroEmpleado.getRolEmpleado());


        // Ejemplo de la clase MovimientoDinero
        MovimientoDinero movimientoUno = new MovimientoDinero();
        movimientoUno.setMontoMovimiento(-500);
        movimientoUno.setConceptoMovimiento("pago factura");
        movimientoUno.setUsuario(miEmpleado);
        System.out.println("\nClase MovimientoDinero");
        System.out.println("Monto movimiento: " + movimientoUno.getMontoMovimiento());
        System.out.println("Concepto: " + movimientoUno.getConceptoMovimiento());
        System.out.println("Nombre Empleado: " + movimientoUno.getUsuario().getNombreEmpleado());
        System.out.println();
        MovimientoDinero movimientoDos = new MovimientoDinero();
        movimientoDos.setMontoMovimiento(800);
        movimientoDos.setConceptoMovimiento("venta de producto");
        movimientoDos.setUsuario(otroEmpleado);
        System.out.println("\nClase MovimientoDinero");
        System.out.println("Monto movimiento: " + movimientoDos.getMontoMovimiento());
        System.out.println("Concepto: " + movimientoDos.getConceptoMovimiento());
        System.out.println("Nombre Empleado: " + movimientoDos.getUsuario().getNombreEmpleado());
    }
}
