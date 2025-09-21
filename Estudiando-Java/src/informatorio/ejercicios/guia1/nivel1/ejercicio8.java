package informatorio.ejercicios.guia1.nivel1;

/*Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?*/

public class ejercicio8 {
    public static void main(String[] args) {
        double num1 = 20.5;
        double num2 = 10.4;

        double multiplicacion = num1 * num2;

        int num3 = 10;
        int num4 = 40;

        int multiplicacion2 = num3 * num4;

        System.out.println("Suma: " + (multiplicacion + multiplicacion2));
    }
}

/*Java cuenta con un sistema llamado "Promoción de tipos" que convierten tipos primitivos de orden más pequeño en otros
de orden más grande. Esto se hace para, por ejemplo, sumar un número real con un número entero. El entero se transforma
en un real antes de que la suma se realice y termina siendo una suma de real + real*/
