package com.mycompany.runpico;


public class PicoDeGallo {
    
    String cilantro = "";
    String chile = "";
    String tomate ="";
    String cebolla = "";

    
    public PicoDeGallo(String cilantro, String chile, String tomate, String cebolla) {
   
        this.cebolla = cebolla;
        this.tomate = tomate;
        this.chile = chile;
        this.cilantro = cilantro;

    }

    public String getCilantro() {
        return cilantro;
    }

    public void setCilantro(String cilantro) {
        this.cilantro = cilantro;
    }

    public String getChile() {
        return chile;
    }

    public void setChile(String chile) {
        this.chile = chile;
    }

    public String getTomate() {
        return tomate;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public String getCebolla() {
        return cebolla;
    }

    public void setCebolla(String cebolla) {
        this.cebolla = cebolla;
    }


    public void leerReceta (){
        System.out.println("La receta del piquillo es: Cebolla: " + this.cebolla + " Chile: " +  this.chile + " Cilantro: " + this.cilantro + " Tomate: " + this.tomate);
    }
    
    public boolean taPicoso(){
        
        boolean picoso = false;
        
        if(this.chile.equals("jalapeño") || this.chile.equals("pimiento rojo") || this.chile.equals("piquin") || this.chile.equals("habanero") || this.chile.equals("del arbol"))
        {
            picoso = true;
            return picoso;
            
        } else {
            
            picoso = false;
            return picoso;
            
        }

   }
}