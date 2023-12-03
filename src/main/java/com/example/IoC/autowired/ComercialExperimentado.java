package com.example.IoC.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * Se puede crear sin id en el @Component y toma el nombre de la clasr en MINUSCULA
 */
@Component
public class ComercialExperimentado implements Empleados {

    private final CreacionInformeFinanciero creacionInformeFinanciero;

    /***
     * @Autowired busca si hay algumna clase que implemente creacionInformeFinanciero
     * en este casso InformeFinancieroTrim1.class desde la vbersion 4.3 la inyeccion de dependecias
     * no se requiere la anotacion ademas solo tiene que haber UNO SOLO CONTYRUCTOR
     */
    @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero creacionInformeFinanciero) {
        this.creacionInformeFinanciero = creacionInformeFinanciero;
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
