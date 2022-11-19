package com.mycompany.runpico;


public class Guacamole extends PicoDeGallo {
    
    int totopos;

    public Guacamole(String cilantro, String chile, String tomate, String cebolla, int totopos) {
        super(cilantro, chile, tomate, cebolla);
        this.totopos = totopos;
    }

    public int getTotopos() {
        return totopos;
    }

    public void setTotopos(int totopos) {
        this.totopos = totopos;
    }
    
    
    public void servirTotopos (){
        int c = 0;
        System.out.println("Aqui tienen totopos uwu");
        
       for(int i=0;i<=this.totopos;i+=1)
        {
                System.out.print("|>|>|>           ");
        } 
        System.out.println("");
       while (c <= this.totopos ){
            
            System.out.print(" *guacamolito* ");
       c++;
       }
        System.out.println("");
      c = 0;  
      do{  
        System.out.print(" *una coquita* ");  
            c++;
         }while(c <= this.totopos);        
        System.out.println("");
    }
    
}