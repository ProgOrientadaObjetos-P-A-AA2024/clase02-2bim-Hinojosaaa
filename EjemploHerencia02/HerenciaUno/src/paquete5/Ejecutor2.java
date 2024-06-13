package paquete5;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        ArrayList<EstudiantePresencial> estudianteP = new ArrayList<>();

        while (bandera) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de los creditos: ");
            double costo = entrada.nextDouble();
            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced,
                    edad, creditos, costo);
            presencial.calcularMatriculaPresencial();
            estudianteP.add(presencial);
            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {
                bandera = false;
            }
        }

        System.out.println(" Lista: \n");
        for (int i = 0; i < estudianteP.size(); i++) {
            
            System.out.printf("%s\n", estudianteP.get(i));
            
        }
    }
}
