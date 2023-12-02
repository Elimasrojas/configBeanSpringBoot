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
        System.out.println( secretario.getEmail());
        System.out.println( secretario.getNombreEmpresa());

        /**
         * Creacion con contructor
         */
        Empleados director = new DirectorEmpleado(new Informe());
        System.out.println( director.getTareas());
        System.out.println( director.getInforme());



        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Ojo ya no se usa la interfaz
        SecretarioEmpleado secre = ctx.getBean("miSecretario", SecretarioEmpleado.class);
        System.out.println(secre.getTareas());
        System.out.println(secre.getInforme());
        System.out.println("Email "+secre.getEmail());
        System.out.println("Name "+secre.getNombreEmpresa());


        /*ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleados juan1 = ctx1.getBean("miempleado", Empleados.class);
        System.out.println(juan1.getTareas());*/


    }
}
