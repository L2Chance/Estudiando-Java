package informatorio.programacion_estructurada.guia1.nivel1;

/*A mi me gustan los pares: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.*/

import java.util.random.RandomGenerator;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num = RandomGenerator.getDefault().nextInt(1,100);
        int[] array = new int[num];
        int actual = 0;
        int suma = 0;

        System.out.println("Límite: " + num);

        while (actual != num){
            suma = suma + 2;
            array[actual] = suma;
            System.out.println(suma);
            actual = actual + 1;

        }
    }
}
