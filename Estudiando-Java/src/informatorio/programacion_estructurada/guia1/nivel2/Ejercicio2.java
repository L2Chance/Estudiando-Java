package informatorio.programacion_estructurada.guia1.nivel2;

/*Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle
WHILE en un bucle FOR.*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int contador = 5;

        System.out.println("Con WHILE");

        while (contador > 0){
            System.out.println("Dogo");
            contador = contador - 1;
        }

        System.out.println("CON FOR");
        for (int i = 0; i < 5 ; i++){
            System.out.println("Dogo");
        }

        System.out.println("Para manejar el while como si fuese un FOR, debemos considerar el uso de un contador que funcione como la variable");
        System.out.println("de condición del FOR");


    }
}
