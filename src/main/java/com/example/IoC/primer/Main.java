package com.example.IoC.primer;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /***
         * Ejemplos de inversion de control
         * s
         */
        Empleados empleados = new JefeEmpleado();
        System.out.println( empleados.getTareas());
        Empleados secretario = new SecretarioEmpleado();
        System.out.println( secretario.getTareas());
        Empleados director = new DirectorEmpleado();
        System.out.println( director.getTareas());

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleados juan = ctx.getBean("miempleado", Empleados.class);
        System.out.println(juan.getTareas());

        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleados juan1 = ctx1.getBean("miempleado", Empleados.class);
        System.out.println(juan1.getTareas());


    }
}
