package TiendaMascotas;

public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;

    Mascota (String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    void imprimir(){
        System.out.println("Nombre de la mascota: " + nombre);
        System.out.println("Edad de la mascota: " + edad + " años");
        System.out.println("Color de la mascota: " + color);
    }
}
