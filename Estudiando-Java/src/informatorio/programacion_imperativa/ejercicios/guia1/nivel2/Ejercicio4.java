package informatorio.programacion_imperativa.ejercicios.guia1.nivel2;

/*Promedio de edad: Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.*/

public class Ejercicio4 {
    public static void main(String[] args) {
        String persona1 = "Lautaro";
        int edad1 = 23;

        String persona2 = "Elias";
        int edad2 = 20;

        int promedio = (edad1 + edad2)/2;

        System.out.println("nombre " + persona1 + " edad: " + edad1);
        System.out.println("nombre " + persona2 + " edad: " + edad2);
        System.out.println("promedio de edad: " + promedio);
    }
}
