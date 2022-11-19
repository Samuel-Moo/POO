
public class DGeneral {
    
    int idPer; String nombrePer, sexoPer; float alturaPer; int edad;
    int idEmo; String emociones, nombre, color, sexoEmo, alturaEmo;
    int idEve; String accion, emocion;
    int idDgEv, idEve2, idEmo2; 
    public DGeneral(int idPer, String nombrePer, String sexoPer, float alturaPer, int edad){
        this.idPer=idPer;
        this.nombrePer=nombrePer;
        this.sexoPer=sexoPer;
        this.alturaPer=alturaPer;
        this.edad=edad;
    } 
    public DGeneral(int idEmo, String emociones, String nombre, String color, String sexoEmo, String alturaEmo){
        this.idEmo=idEmo;
        this.emociones=emociones;
        this.nombre=nombre;
        this.color=color;
        this.sexoEmo=sexoEmo;
        this.alturaEmo=alturaEmo;
        
    }
    public DGeneral(int idEve, String accion, String emocion){}
    public DGeneral(int idDgEv, int idEve2, int idEmo2){}
}
