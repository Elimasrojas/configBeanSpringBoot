package com.example.IoC.anotacionSingletonPrototype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnotaciones {

    /***
     * @Component
     * @Scope("prototype")
     * public class ComercialExperimentado implements Empleados {
     * para este cado usamos @Scope
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("anotacionesSingletonPrototype.xml");
        Empleados emp=ctx.getBean("comercialExperimentado", Empleados.class);
        Empleados emp2=ctx.getBean("comercialExperimentado", Empleados.class);
        System.out.println(emp2==emp?"son el mismo obj":"son diferentes boj");
    }
}
