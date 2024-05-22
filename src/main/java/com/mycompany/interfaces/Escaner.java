package com.mycompany.interfaces;

public class Escaner implements IDispositivoElectronico {

    @Override
    public void encender() {
        System.out.println("Se encendió el Escaner");
    }

    @Override
    public void apagar() {
        System.out.println("Se apagó el Escaner");
    }
    
}
