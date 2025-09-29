package informatorio.programacion_estructurada.guia1.nivel1;

/*¿De qué se trata esto?: Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.*/

import java.util.random.RandomGenerator;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num = RandomGenerator.getDefault().nextInt(-100,100);

        System.out.println("numero: " + num);

        if (num > 0){
            System.out.println("El número es positivo");
        }
        else{
            if (num < 0){
                System.out.println("El número es negativo");
            }
            else{
                System.out.println("El número es cero");
            }
        }
    }
}
