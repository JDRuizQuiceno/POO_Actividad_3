package Universidad;

public class Prueba {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Juan", "Avenida las palmas 45-41", "Estadistica", 4);
        Profesor profesor1 = new Profesor("David", "Calle 58 #37E-065", "Matemáticas", "Profesor titular");

        System.out.println("Información del estudiante: ");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Dirección: " + estudiante1.getDireccion());
        System.out.println("Carrera: " + estudiante1.getCarrera());
        System.out.println("Semestre: " + estudiante1.getSemestre());
        System.out.println();

        System.out.println("Información del docente: ");
        System.out.println("Nombre: " + profesor1.getNombre());
        System.out.println("Dirección: " + profesor1.getDireccion());
        System.out.println("Departamento: " + profesor1.getDepartamento());
        System.out.println("Categoría: " + profesor1.getCategoria());

    }
}
