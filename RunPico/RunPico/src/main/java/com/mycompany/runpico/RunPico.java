package com.mycompany.runpico;


public class RunPico {

    public static void main(String[] args) {
        
        PicoDeGallo piquillo = new PicoDeGallo("picado", "jalapeño", "jitomate", "morada");
        Guacamole waka = new Guacamole("picado", "chilaca", "tomate", "blanca", 15);
        
        piquillo.leerReceta();
        System.out.println("El pico de gallo pica como toro sin pastillas??? " + piquillo.taPicoso());
        System.out.println("--------------------------------------------------------------------------------------------");
        waka.servirTotopos();
        
        
    }
}
