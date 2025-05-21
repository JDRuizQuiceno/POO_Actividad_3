package TiendaMascotas;

public class PerrosMedianos extends Perros{
    public enum Raza{
        COLLIE, DALMATA, BULLDOG, GALGO, SABUESO
    }

    protected Raza raza;

    public PerrosMedianos(String nombre, int edad, String color, double peso, boolean muerde, Raza raza){
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
