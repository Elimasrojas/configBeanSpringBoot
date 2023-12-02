package com.example.IoC.primer;

import com.example.IoC.inyecciondependencia.CreacionInforme;

public class JefeEmpleado implements Empleados{
    private final CreacionInforme creacionInforme;

    public JefeEmpleado(CreacionInforme creacionInforme) {
        this.creacionInforme = creacionInforme;
    }

    @Override
    public String getTareas() {
        return "soy el jefe de empleados";
    }

    @Override
    public String getInforme() {
        return "Jefe de empleado Crea Informe "+creacionInforme.getInforme();
    }
}
