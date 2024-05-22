package com.mycompany.interfaces;

public class ImpresoraWifi implements IDispositivoElectronico, IConectividad {

    @Override
    public void encender() {
        System.out.println("Se encendió la impresora con Wifi");
    }

    @Override
    public void apagar() {
        System.out.println("Se apagó la impresora con Wifi");
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a una red wifi ...");
    }
    
}
