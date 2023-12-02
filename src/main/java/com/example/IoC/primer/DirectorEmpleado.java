package com.example.IoC.primer;

import com.example.IoC.inyecciondependencia.CreacionInforme;

public class DirectorEmpleado implements Empleados {

    /***
     * 1. Creaamo campo de tipo CREACIONINFORME
     *  2.
     */

    private final CreacionInforme creacionInforme;

    public DirectorEmpleado(CreacionInforme creacionInforme) {
        this.creacionInforme = creacionInforme;
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
