package informatorio.programacion_estructurada.guia1.nivel2;

/*Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un
DO WHILE.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int i = 0;

        System.out.println("CON WHILE");

        while (i != 4){
            System.out.println(array[i]);
            i = i + 1;
        }

        i = 0;

        System.out.println("CON DO WHILE");

        do {
            System.out.println(array[i]);
            i = i + 1;
        }while (i != 4);

        System.out.println();
        System.out.println("Para tratar un WHILE como si fuese un DO WHILE hay que asegurarnos de que en la primera iteración la variable de condición");
        System.out.println("sea verdadera. De esa manera, el bucle de ejecutará al menos una vez.");
    }
}
