package com.example.IoC.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnotatiosAutowired {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesAutowired.xml");
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp.getTareas());;
        System.out.println(   emp.getInforme());;

    }
}
