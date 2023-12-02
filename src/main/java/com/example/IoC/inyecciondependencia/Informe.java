package com.example.IoC.inyecciondependencia;

public class Informe implements CreacionInforme{
    @Override
    public String getInforme() {
        return "Presentar informe";
    }
}
