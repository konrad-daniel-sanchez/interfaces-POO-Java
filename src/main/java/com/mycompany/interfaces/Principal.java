package com.mycompany.interfaces;

public class Principal {
    public static void main(String[] args) {
        /**
        IDispositivoElectronico[] dispositivos = new IDispositivoElectronico[10];
        
        dispositivos[0] = new Impresora();
        dispositivos[1] = new Escaner();
        dispositivos[2] = new Celular();
        dispositivos[3] = new ImpresoraWifi();
        
        for (int i = 0; i < dispositivos.length; i++) {
            if(dispositivos[i] != null){
                dispositivos[i].encender();
                dispositivos[i].apagar();
            }
        }
        **/
        ImpresoraWifi impresoraWifi = new ImpresoraWifi();
        impresoraWifi.encender();
        impresoraWifi.conectar();
        impresoraWifi.apagar();
    }
}
