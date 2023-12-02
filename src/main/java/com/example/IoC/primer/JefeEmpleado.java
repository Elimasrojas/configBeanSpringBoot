package com.example.IoC.primer;

public class JefeEmpleado implements Empleados{

    @Override
    public String getTareas() {
        return "soy el jefe de empleados";
    }

    @Override
    public String getInforme() {
        return "Jefe de empleado Crea Informe";
    }
}
