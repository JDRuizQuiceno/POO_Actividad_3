package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{

     protected static double valorArea =  2500000;
     protected int valorAdministracion;
     protected boolean piscina;
     protected boolean camposDeportivos;

     public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int valorAdministracion, boolean piscina, boolean camposDeportivos){
         super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
         this.valorAdministracion = valorAdministracion;
         this.piscina = piscina;
         this.camposDeportivos = camposDeportivos;
     }

     void imprimir(){
         super.imprimir();
         System.out.println("Valor de la administración = " + valorAdministracion);
         System.out.println("Piscina = " + piscina);
         System.out.println("Campos deportivos = " + camposDeportivos);
         System.out.println();
     }
}
