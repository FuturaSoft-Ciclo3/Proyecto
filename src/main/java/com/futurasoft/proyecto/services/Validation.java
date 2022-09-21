package com.futurasoft.proyecto.services;

import java.util.regex.Pattern;

public class Validation {

    // Validar correo electrónico
    public static boolean isEmailValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }
}
