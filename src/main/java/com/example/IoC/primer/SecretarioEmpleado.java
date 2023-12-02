package com.example.IoC.primer;

import com.example.IoC.inyecciondependencia.CreacionInforme;

public class SecretarioEmpleado implements Empleados {
    private final CreacionInforme creacionInforme;

    public SecretarioEmpleado(CreacionInforme creacionInforme) {
        this.creacionInforme = creacionInforme;
    }

    @Override
    public String getTareas() {
        return "soy un secretario";
    }

    @Override
    public String getInforme() {
        return "Secretario crea informe "+creacionInforme.getInforme();
    }
}
