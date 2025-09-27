package informatorio.ejercicios.guia1.nivel1;

/*Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … +
Numero1*Numero2/15. El resultado mostrarlo por pantalla.*/

public class Ejercicio11 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int resultado = 0;
        int multiplicaciones = 0;
        for (int i=0; i<15; i++ ){
            multiplicaciones = multiplicaciones + 1;
            resultado = resultado + (num1*num2)/multiplicaciones;

            System.out.println("Multiplicacion: " + multiplicaciones);
        }

        System.out.println("Resultado: " + resultado);

    }
}
