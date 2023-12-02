package com.example.IoC.primer;

import com.example.IoC.inyecciondependencia.CreacionInforme;

public class DirectorEmpleado implements Empleados {

    /***
     * 1. Creaamo campo de tipo CREACIONINFORME
     *  2.
     */
    private String email;
    private String nombreEmpresa;

    private final CreacionInforme creacionInforme;

    public DirectorEmpleado(CreacionInforme creacionInforme) {
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
        return "Soy Director";
    }

    @Override
    public String getInforme() {
        return "Director crea informe: "+creacionInforme.getInforme();
    }
}
