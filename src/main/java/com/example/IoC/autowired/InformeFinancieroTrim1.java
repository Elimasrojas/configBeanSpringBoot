package com.example.IoC.autowired;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe financiero Trim 1";
    }
}
