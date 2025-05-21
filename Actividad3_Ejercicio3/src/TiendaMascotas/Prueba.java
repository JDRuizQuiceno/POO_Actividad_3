package TiendaMascotas;

public class Prueba {
    public static void main (String[] args){
        PerrosGrandes perro1 = new PerrosGrandes("Falcao", 9, "Café", 35, true, PerrosGrandes.Raza.PASTOR_ALEMAN);
        System.out.println("Datos Mascota");
        perro1.imprimir();
        Perros.sonido();
        System.out.println();

        PerrosPequenos perro2 = new PerrosPequenos("Levi", 8, "Blanco", 15, true, PerrosPequenos.Raza.SCHNAUZER);
        System.out.println("Datos Mascota");
        perro2.imprimir();
        Perros.sonido();
        System.out.println();

        GatosPeloCorto gato1 = new GatosPeloCorto("Erwin", 11, "Gris", 4, 15, GatosPeloCorto.Raza.BRITANICO);
        System.out.println("Datos Mascota");
        gato1.imprimir();
        Gatos.sonido();
        System.out.println();

        GatosPeloLargo gato2 = new GatosPeloLargo("Vladimir", 11, "naranja", 2, 5, GatosPeloLargo.Raza.HIMALAYO);
        System.out.println("Datos Mascota");
        gato2.imprimir();
        Gatos.sonido();
        System.out.println();
    }
}
