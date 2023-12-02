package com.example.IoC.primer;


import com.example.IoC.inyecciondependencia.CreacionInforme;
import com.example.IoC.inyecciondependencia.Informe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /***
         * Ejemplos de inversion de control
         * s
         */
        /**
         * Creacion con contructor
         */
        Empleados empleados = new JefeEmpleado(new Informe());
        System.out.println( empleados.getTareas());
        System.out.println( empleados.getInforme());

        /***
         * Creacion con setter
         */
        SecretarioEmpleado secretario = new SecretarioEmpleado();
        secretario.setCreacionInforme(new Informe());
        System.out.println( secretario.getTareas());
        System.out.println( secretario.getInforme() );

        /**
         * Creacion con contructor
         */
        Empleados director = new DirectorEmpleado(new Informe());
        System.out.println( director.getTareas());
        System.out.println( director.getInforme());



        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleados secre = ctx.getBean("miSecretario", Empleados.class);
        System.out.println(secre.getTareas());
        System.out.println(secre.getInforme());
        ctx.close();

        /*ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleados juan1 = ctx1.getBean("miempleado", Empleados.class);
        System.out.println(juan1.getTareas());*/


    }
}
