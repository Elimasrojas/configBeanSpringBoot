package com.example.IoC.anotacionConfig;

public class DirectorFinanciero implements Empleados{

    private final CreacionInformeFinanciero creacionInformeFinanciero;
    public DirectorFinanciero(CreacionInformeFinanciero creacionInformeFinanciero) {
        this.creacionInformeFinanciero = creacionInformeFinanciero;
    }

    @Override
    public String getTareas() {
        return "DirectorFinanciero hace las tareas ";
    }

    @Override
    public String getInforme() {
        return creacionInformeFinanciero.getInformeFinanciero();
    }



}
