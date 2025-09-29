package informatorio.programacion_imperativa.ejercicios.guia1.nivel1;
import java.util.Random;

/*
Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Random generator = new Random();

        int num1 = generator.nextInt(0,100);
        int num2 = generator.nextInt(0,100);

        System.out.println("numero 1: " + num1);
        System.out.println("numero 2: " + num2);

        int suma = num1 + num2;

        if (suma % 2 == 0){
            System.out.println("El número es " + suma + " y es par");
        }
        else{
            System.out.println("El número es " + suma + " y es impar");
        }

    }
}
