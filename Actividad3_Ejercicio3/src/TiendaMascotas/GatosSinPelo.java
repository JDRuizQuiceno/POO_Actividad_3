package TiendaMascotas;

public class GatosSinPelo extends Gatos{
    public enum Raza{
        ESFINGE, ELFO, DONSKOY
    }

    protected Raza raza;

    public GatosSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, Raza raza){
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
