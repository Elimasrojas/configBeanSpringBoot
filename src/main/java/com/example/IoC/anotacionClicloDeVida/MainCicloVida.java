package com.example.IoC.anotacionClicloDeVida;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCicloVida {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesCicloDeVida.xml");
        com.example.IoC.anotacionClicloDeVida.Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        com.example.IoC.anotacionClicloDeVida.Empleados emp2=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp2==emp?"son el mismo obj":"son diferentes boj");
    }
}
