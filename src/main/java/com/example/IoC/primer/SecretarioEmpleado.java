package com.example.IoC.primer;

import com.example.IoC.inyecciondependencia.CreacionInforme;

public class SecretarioEmpleado implements Empleados {
    private  CreacionInforme creacionInforme;
    private String email;
    private String nombreEmpresa;

    public void setCreacionInforme(CreacionInforme creacionInforme) {
        this.creacionInforme = creacionInforme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
