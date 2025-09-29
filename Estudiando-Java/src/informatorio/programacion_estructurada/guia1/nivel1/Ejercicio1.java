package informatorio.programacion_estructurada.guia1.nivel1;

/*Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        final int altura = 12;


        for (int fila = 1 ; fila < altura ; fila+= 2 ){

            for (int espacio = altura ; espacio > fila ; espacio-=2){
                System.out.print(" ");
            }
            for (int filaActual = 0 ; filaActual < fila ; filaActual++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
