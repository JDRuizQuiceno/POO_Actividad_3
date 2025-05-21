package Inmuebles;

public class Casa  extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa (int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int NumeroPisos){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroBanos;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Número de pisos = " + numeroPisos);
    }
}
