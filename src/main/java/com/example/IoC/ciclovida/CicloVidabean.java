package com.example.IoC.ciclovida;

import com.example.IoC.primer.DirectorEmpleado;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CicloVidabean {
    /***
     * 1.Inicia contenedor
     * 2.Instancion de Bean
     * 3.Inyeccion de dependencias
     * 4.Procesado del Bean
     * 4.1 --->.metodo init
     * 5.Buean listo para uso
     * 6.Conteedpr de Spring Apagado
     * 6.1 --->metodo destroy
     */

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
        // Ojo ya no se usa la interfaz
        DirectorEmpleado direct = ctx.getBean("miEmpleado", DirectorEmpleado.class);
        System.out.println(direct.getTareas());
        System.out.println(direct.getInforme());

        ctx.close();
    }
}
