package paquete3;

public class Ejecutor3 {
    public static void main(String[] args) {
        
        // Creación de un objeto de tipo EstudianteDistancia
        
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial estudiante = new EstudiantePresencial(nombre, 
                apellido, identificacion, edad);
        estudiante.establecerCostoCredito(100.2);
        estudiante.establecerNumeroCreditos(5);
        estudiante.calcularMatriculaPresencial();
       
        
        System.out.println(estudiante);
                
        
    }
}
