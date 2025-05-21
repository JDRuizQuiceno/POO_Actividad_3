package TiendaMascotas;

public class PerrosPequenos extends Perros{
    public enum Raza{
        CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA
    }

    protected Raza raza;

    public PerrosPequenos(String nombre, int edad, String color, double peso, boolean muerde, Raza raza){
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
