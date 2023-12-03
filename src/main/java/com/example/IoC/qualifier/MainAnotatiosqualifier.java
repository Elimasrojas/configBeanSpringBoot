package com.example.IoC.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnotatiosqualifier {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesqualifier.xml");
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp.getTareas());;
        System.out.println(   emp.getInforme());;

    }
}
