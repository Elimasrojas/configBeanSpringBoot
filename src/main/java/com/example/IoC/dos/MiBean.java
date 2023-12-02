package com.example.IoC.dos;

// MiBean.java
public class MiBean {
    private String mensaje;

    // Constructor
    public MiBean() {
    }

    // Setter
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Método para mostrar el mensaje
    public void mostrarMensaje() {
        System.out.println("Mensaje: " + mensaje);
    }
}
