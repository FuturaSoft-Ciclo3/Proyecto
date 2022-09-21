package com.futurasoft.proyecto.services;

import com.futurasoft.proyecto.entities.Empleado;
import com.futurasoft.proyecto.repository.IEmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

import static com.futurasoft.proyecto.services.Validation.isEmailValid;

@Service
public class EmpleadoService {

    @Autowired
    IEmpleadoRepository empleadoRepository;


    // Muestra todos los empleados
    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) this.empleadoRepository.findAll();
    }

    // Muestra un empleado
    public Empleado getEmpleadoById(long id) {
        Optional<Empleado> empleado = this.empleadoRepository.findById(id);
        return empleado.orElse(null);

    }

    // Crea un empleado
    public String createEmpleado(Empleado data) {
        ArrayList<Empleado> empleados = this.empleadoRepository.existeCorreo(data.getEmailEmpleado());
        if (empleados != null && empleados.size() > 0) {
            return "El correo electrónico ya está en uso";
        }

        // comprobar email
        System.out.println(data.getEmailEmpleado());
        if (!isEmailValid(data.getEmailEmpleado())) {
            return "El correo electrónico no es válido";
        }

        // comprobar contraseña
        if (data.getPassword() == null || data.getPassword().equals("")) {
            return "Error, su contraseña no es válida";
        }

        //BCryptPasswordEncoder encrypt = new BCryptPasswordEncoder();
        //data.setPassword(encrypt.encode(data.getPassword()));
        data.setPassword(data.getPassword());

        this.empleadoRepository.save(data);
        return "empleado agregado";

    }

    // Actualiza o modifica un empleado
    public String updateEmpleado(Empleado data) {
        if (data.getId() == 0) {
            return "Error, el id del usuario no es válido";
        }

        // validar si el empleado existe
        Empleado empleado = getEmpleadoById(data.getId());
        if (empleado == null)
            return "Error, el empleado no existe";

        if (data.getEmailEmpleado() == null || data.getEmailEmpleado().equals(""))
            return "Error, el correo electrónico está vacío";

        if (!isEmailValid(data.getEmailEmpleado()))
            return "Error, ingrese un correo electrónico válido";

        empleado.setEmailEmpleado(data.getEmailEmpleado());
        //agregar aquí los otros campos que se requieren actualizar

        this.empleadoRepository.save(empleado);

        return "empleado actualizado";
    }

    // Elimina un empleado
    public String deleteEmpleado(long id) {
        try {
            this.empleadoRepository.deleteById(id);
            return "empleado eliminado";
        } catch (Exception e) {
            return "Error" + e;
        }
    }
}
