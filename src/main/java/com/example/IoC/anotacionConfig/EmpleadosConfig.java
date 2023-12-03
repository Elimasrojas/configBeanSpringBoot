package com.example.IoC.anotacionConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.IoC.anotacionConfig")
public class EmpleadosConfig {
    @Bean
    public CreacionInformeFinanciero creacionInformeFinanciero(){ // creacionInformeFinanciero es el id
        return new InformeFinancieroDptoCompras();
    }

    @Bean
    public Empleados directorFinanciero(){
        return  new DirectorFinanciero(creacionInformeFinanciero());
    }
}
