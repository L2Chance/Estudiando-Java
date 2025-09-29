package informatorio.programacion_imperativa.ejercicios.guia1.nivel1;
import java.util.Random;

/*Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.*/

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(0,100);
        int num2 = random.nextInt(0,100);
        int suma = num1 + num2;
        double division = (double) num1 / num2;

        System.out.println("suma: " + suma);
        if (num1 % num2 == 0){
            System.out.println(num1 + " es divisible por " + num2);
        }
        else{
            System.out.println(num1 + " no es divisible por " + num2);
        }
        System.out.println("División: " + division);
    }
}
