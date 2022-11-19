public class ConsultaPersonas extends Personas{
    public ConsultaPersonas(
    String colorOjos, int ojos, String Cabello, double estatura){
        setColorOjos(colorOjos);
        setOjos(ojos);
        setCabello(Cabello);
        setEstatura(estatura);
    }
    public static void main(String[] args) {
        ConsultaPersonas c = new ConsultaPersonas(
        "Café", 2, "Café", 1.68);
        c.setCabello("Castaño");
        System.out.println("la estatura es "
                + c.getEstatura());
        c.mostrarDatos();
    }
}
