package com.example.IoC.dos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        // Crea el contexto de aplicación desde el archivo XML
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/IoC/dos/aplicationContext2.xml");

        // Obtiene el bean "miBean" del contexto
        MiBean miBean = (MiBean) context.getBean("miBean");

        // Usa el bean para mostrar el mensaje
        miBean.mostrarMensaje();
    }
}
