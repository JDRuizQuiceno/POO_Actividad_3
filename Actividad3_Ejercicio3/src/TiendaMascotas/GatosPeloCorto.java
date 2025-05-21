package TiendaMascotas;

public class GatosPeloCorto extends Gatos{
    public enum Raza{
        AZUL_RUSO, BRITANICO, MANX, DEVON_REX
    }

    protected Raza raza;

    public GatosPeloCorto(String nombre, int edad, String color, double alturasalto, double longitudSalto, Raza raza){
        super(nombre, edad, color, alturasalto, longitudSalto);
        this.raza = raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
