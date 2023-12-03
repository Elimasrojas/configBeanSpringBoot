package com.example.IoC.anotacionClicloDeVida;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/***
 * Se puede crear sin id en el @Component y toma el nombre de la clasr en MINUSCULA
 */
@Component
public class ComercialExperimentado implements Empleados {

    /***
     * @Autowired busca si hay algumna clase que implemente creacionInformeFinanciero
     * en este casso InformeFinancieroTrim1.class desde la vbersion 4.3 la inyeccion de dependecias
     * no se requiere la anotacion ademas solo tiene que haber UNO SOLO CONTYRUCTOR
     *
     * por eso es sano private  final CreacionInformeFinanciero creacionInformeFinanciero;
     * declararla final para que solo puedad crear uin contructor
     *
     * para ejecutar PostConstruct y PreDestroy solo trabaja en Scope singleton
     */

    @Autowired //aplica por detras Reflexion
    @Qualifier("informeFinancieroTrim1")
    private CreacionInformeFinanciero creacionInformeFinanciero;

    /*
    @Autowired
    public void setCreacionInformeFinanciero(CreacionInformeFinanciero creacionInformeFinanciero) {
        this.creacionInformeFinanciero = creacionInformeFinanciero;
    }*/

    /*
    @Autowired
    public void culaquiermetodo(CreacionInformeFinanciero creacionInformeFinanciero) {
        this.creacionInformeFinanciero = creacionInformeFinanciero;
    }
    */
    @PostConstruct
    public void metodoInit(){
        System.out.println("metono al inicial Bean CreacionInformeFinanciero");
    }

    @PreDestroy
    public void metodoFinal(){
        System.out.println("metono al destruir Bean CreacionInformeFinanciero");
    }


    @Override
    public String getTareas() {
        return "Realizo tareas de ComercialExperimentado";
    }

    @Override
    public String getInforme() {
        //return "Realizo informe de ComercialExperimentado";
        return  creacionInformeFinanciero.getInformeFinanciero();

    }
}
