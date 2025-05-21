package TiendaMascotas;

public class GatosPeloLargo extends Gatos{
    public enum Raza{
        ANGORA, HIMALAYO, BALINES, SOMALI
    }

    protected Raza raza;

    public GatosPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, Raza raza){
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
