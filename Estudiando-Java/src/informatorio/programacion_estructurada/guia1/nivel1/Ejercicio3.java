package informatorio.programacion_estructurada.guia1.nivel1;

/*Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar.*/

import java.util.random.RandomGenerator;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num = RandomGenerator.getDefault().nextInt(0,100);

        System.out.println("Número: " + num);

        if (num % 2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}
