package com.example.IoC.singletonyprototype;

import com.example.IoC.primer.SecretarioEmpleado;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        SecretarioEmpleado secre1 = ctx.getBean("miSecretario", SecretarioEmpleado.class);
        SecretarioEmpleado secre2 = ctx.getBean("miSecretario", SecretarioEmpleado.class);
        System.out.println(secre1 );
        System.out.println(secre2);
        System.out.println(secre1==secre2?"verdadero":"falso");
    }
}
