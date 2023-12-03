package com.example.IoC.anotaciones;

import org.springframework.stereotype.Component;

@Component("ComercialExperim")
public class ComercialExperimentado implements Empleados {
    @Override
    public String getTareas() {
        return "Realizo tareas de ComercialExperimentado";
    }

    @Override
    public String getInforme() {
        return "Realizo informe de ComercialExperimentado";
    }
}
