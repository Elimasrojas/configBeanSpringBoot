package com.example.IoC.anotacionConfig;

public class InformeFinancieroDptoCompras implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Informe financier realizado por InformeFinancieroDptoCompras";
    }
}
