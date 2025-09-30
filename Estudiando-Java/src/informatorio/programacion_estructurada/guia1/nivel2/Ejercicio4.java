package informatorio.programacion_estructurada.guia1.nivel2;

/*Suma del rango de números: Escribir un programa que encuentre la suma de los
números impares en un rango de números enteros guardados en una variable.*/

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int acumulador = 0;

        for (int numero : numeros){
            if (numero % 2 != 0){
                acumulador = acumulador + numero;
                System.out.println("Número impar encontrado: " + numero);
                System.out.println();
            }
        }

        System.out.println("Suma de números impares: " + acumulador);

    }
}
