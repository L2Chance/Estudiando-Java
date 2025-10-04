package informatorio.programacion_estructurada.guia1.nivel2;

/*¡Y más… sumas!: Realizar un programa donde se guarde un número entero en una
variable y que imprima por pantalla el resultado de la suma de todos los números
enteros desde 1 hasta ese número.*/

public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 100;
        int suma = 0;

        if (num != 0){
            for (int i = num; i != 0; i--){
                suma = suma + i;
            }
        }

        System.out.println("suma: " + suma);

    }
}
