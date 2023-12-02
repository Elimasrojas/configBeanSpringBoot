package com.example.IoC.primer;

public class SecretarioEmpleado implements Empleados {

    @Override
    public String getTareas() {
        return "soy un secretario";
    }

    @Override
    public String getInforme() {
        return "Secretario crea informe";
    }
}
