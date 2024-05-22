package com.mycompany.interfaces;

public class PrincipalSwitchCase {
    public static void main(String[] args) {
        String tipoDispositivo = "Celular";
        switch (tipoDispositivo) {
            case "Impresora":
                Impresora impresora = new Impresora();
                impresora.encender();
                impresora.apagar();
            case "Escaner":
                Escaner escaner = new Escaner();
                escaner.encender();
                escaner.apagar();
            case "Celular":
                Celular celular = new Celular();
                celular.encender();
                celular.apagar();
            default:
                throw new AssertionError();
        }
    }
}
