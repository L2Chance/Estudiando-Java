package informatorio.programacion_estructurada.guia1.nivel2;

/*El factorial : Realizar un programa que calcule el factorial de un número*/

public class Ejercicio3 {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        for (int i = num ; i > 0 ; i--){
            factorial = factorial*i;
        }

        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
