package informatorio.programacion_imperativa.ejercicios.guia1.nivel3;

/*Obtener porcentaje: Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        double num1 = 20.50;
        int num2 = 10;

        int porcentaje = (int) (num1 * num2 / 100);

        System.out.println("Porcentaje: " + porcentaje);

    }
}
