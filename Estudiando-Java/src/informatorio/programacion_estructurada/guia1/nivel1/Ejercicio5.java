package informatorio.programacion_estructurada.guia1.nivel1;

/*La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria.*/

import java.util.random.RandomGenerator;

public class Ejercicio5 {
    public static void main(String[] args) {
        int maximo = RandomGenerator.getDefault().nextInt(1,100);

        System.out.println("maximo: " + maximo);

        int resultado = 0;

        for (int i = 1 ; i <= maximo ; i++){
            resultado = resultado + i;
        }

        System.out.println("Resultado: " + resultado);
    }
}
