package com.example.IoC.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnotation {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("anotaciones.xml");
        Empleados emp=ctx.getBean("ComercialExperim",Empleados.class);
        System.out.println(emp.getTareas());;
        System.out.println(   emp.getInforme());;

    }
}
