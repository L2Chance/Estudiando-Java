package informatorio.DesafioCodeChadsAcademyPOO.dominio;

import java.util.Scanner;

public class Academia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estudiante est1 = new Estudiante("Elon Musk");
        Estudiante est2 = new Estudiante("Bill Gates");
        Estudiante est3 = new Estudiante("Jeff Bezos");

        Curso cursoJava = new Curso("Backend Sensei (Java)");
        cursoJava.agregarEstudiante(est1);
        cursoJava.agregarEstudiante(est2);
        cursoJava.agregarEstudiante(est3);

        System.out.println("--- PRUEBAS DEL CURSO: " + cursoJava.getNombre() + " ---");

        System.out.println("\n--- INGRESO DE NOTAS ---");

        System.out.println("Ingreso de notas para: " + est1.getNombre());
        est1.subirNotas(scanner);

        System.out.println("\nIngreso de notas para: " + est2.getNombre());
        est2.subirNotas(scanner);

        System.out.println("\nIngreso de notas para: " + est3.getNombre());
        est3.subirNotas(scanner);

        System.out.println("\n--- ANÁLISIS DEL CURSO ---");


        cursoJava.verEstudianteConPromedioMasAlto();

        cursoJava.verEstudianteMasRegular();

        cursoJava.verPeorRendimientoEnTerceraPrueba();

        System.out.println("\n--- PRUEBAS INDIVIDUALES (Métodos de Estudiante) ---");

        System.out.println("\nNotas ordenadas para " + est2.getNombre() + ":");
        est2.ordenarNotas();

        System.out.print("\nEvaluación Final para " + est1.getNombre() + ": ");
        est1.mostrarEvaluacionFinal();

        System.out.print("\nVariación de notas para " + est3.getNombre() + ": ");
        est3.encontrarMayorVariacion();


        scanner.close();
    }
}
