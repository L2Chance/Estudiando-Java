package informatorio.programacion_estructurada.guia1.nivel3;

/*Dame los mayores y los menores: Dado un arreglo con valores enteros, realice la
búsqueda de otro entero, si encontró el entero mostrarlo por pantalla si no muestre
por pantalla que no lo encontró.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el número que quiera buscar");
        int numeroABuscar = scanner.nextInt();

        int posicionMedia;
        int inicio = 0;
        int extremo = arreglo.length - 1;
        boolean encontrado = false;

        while (inicio <= extremo) {
            posicionMedia = (inicio + extremo) / 2;
            if (arreglo[posicionMedia] < numeroABuscar) {
                inicio = posicionMedia + 1;
            } else if (arreglo[posicionMedia] > numeroABuscar) {
                extremo = posicionMedia - 1;
            } else {
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            System.out.println("El número si se encontró en el array");
        }
        else{
            System.out.println("El número no fue encontrado");
        }
        scanner.close();
    }
}
