package TiendaMascotas;

public class PerrosGrandes extends Perros{
    public enum Raza{
        PASTOR_ALEMAN, DOBERMAN, ROTTWEILER
    }

    protected Raza raza;

    public PerrosGrandes(String nombre, int edad, String color, double peso, boolean muerde, Raza raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }

}
