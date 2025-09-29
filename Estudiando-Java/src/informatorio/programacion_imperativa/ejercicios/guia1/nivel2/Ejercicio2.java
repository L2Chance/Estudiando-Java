package informatorio.programacion_imperativa.ejercicios.guia1.nivel2;

/*Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Qué operador podría
usar para hacerlo?*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int num = 30;

        for (int i = 0 ; i < 20 ; i++){
            num--;
        }

        System.out.println("Numero disminuido 20: " + num);
    }
}
