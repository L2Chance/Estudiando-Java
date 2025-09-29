package informatorio.programacion_imperativa.ejercicios.guia1.nivel1;

/*Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola.*/

public class Ejercicio6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i+=2){
            for (int z = 20; z>=i; z-=2){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
