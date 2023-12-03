package com.example.IoC.anotacionConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfiguration {
    /***
     * EmpleadosConfig
     * al llamar los bean de la clase el id es el nombre del metodo
     * por es   directorFinanciero emp=ctx.getBean("directorFinanciero", Empleados.class);
     * se llama directorFinanciero y este a su vez retorna la istancia de
     * turn  new DirectorFinanciero(creacionInformeFinanciero());
     */

    public static void main(String[] args) {
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesCicloDeVida.xml");
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        Empleados emp2=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp2==emp?"son el mismo obj":"son diferentes boj");*/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
        Empleados emp=ctx.getBean("directorFinanciero", Empleados.class);
        System.out.println(emp.getTareas());
        System.out.println(emp.getInforme());
    }
}
