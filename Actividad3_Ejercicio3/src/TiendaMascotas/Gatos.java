package TiendaMascotas;

public class Gatos extends Mascota{
    protected double alturaSalto;
    protected double longitudSalto;

    public Gatos(String nombre, int edad, String color, double alturaSalto, double longitudSalto){
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public static void sonido(){
        System.out.println("Los gatos maúllan y ronronean");
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Altura salto: " + alturaSalto + " metros");
        System.out.println("Longitud salto: " + longitudSalto + " metros");
    }
}
