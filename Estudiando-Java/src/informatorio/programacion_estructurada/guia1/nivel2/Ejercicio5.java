package informatorio.programacion_estructurada.guia1.nivel2;

/*Positivos y divisibles por 7: Realizar un programa que muestre por pantalla los
números enteros positivos que sean divisibles por 7 y que sean menores que 100.*/

public class Ejercicio5 {
    public static void main(String[] args) {

        for (int numero = 0; numero < 100 ; numero++){
            if (numero % 7 == 0){
                System.out.println("Número multiplo de 7: " + numero);
            }
        }
    }
}
