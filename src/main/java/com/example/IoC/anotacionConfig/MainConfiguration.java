package com.example.IoC.anotacionConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfiguration {


    public static void main(String[] args) {
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesCicloDeVida.xml");
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        Empleados emp2=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp2==emp?"son el mismo obj":"son diferentes boj");*/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp.getTareas());
        System.out.println(emp.getInforme());
    }
}
