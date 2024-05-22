package com.mycompany.interfaces;

public class Celular implements IDispositivoElectronico {
    public void encender() {
        System.out.println("Se encendió el celular");
    }

    public void apagar() {
        System.out.println("Se Apagó el celular");
    }
}
