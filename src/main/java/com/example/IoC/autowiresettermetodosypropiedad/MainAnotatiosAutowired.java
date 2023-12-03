package com.example.IoC.autowiresettermetodosypropiedad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnotatiosAutowired {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesAutowiredsetter.xml");
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp.getTareas());;
        System.out.println(   emp.getInforme());;

    }
}
