package Inmuebles;

public class Oficina extends Local{

    protected static double valorArea = 3500000;
    protected boolean gobierno;

    public Oficina (int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean gobierno){
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.gobierno = gobierno;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Es oficina de gobierno = " + gobierno);
        System.out.println();
    }
}
