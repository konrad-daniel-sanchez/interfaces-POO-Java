package com.mycompany.interfaces;

public class Impresora implements IDispositivoElectronico{

    @Override
    public void encender() {
        System.out.println("Se encendió la impresora");
    }

    @Override
    public void apagar() {
        System.out.println("Se Apagó la impresora");
    }
    
}
