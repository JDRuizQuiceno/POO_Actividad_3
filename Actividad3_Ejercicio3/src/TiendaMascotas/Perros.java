package TiendaMascotas;

public class Perros extends Mascota{
    protected double peso;
    protected boolean muerde;

    public Perros(String nombre, int edad, String color, double peso, boolean muerde){
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public static void sonido(){
        System.out.println("Los perros ladran");
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Muerde: " + muerde);
    }
}
