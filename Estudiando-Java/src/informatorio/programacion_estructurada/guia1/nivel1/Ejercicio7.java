package informatorio.programacion_estructurada.guia1.nivel1;

/*Espero aprobar: Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto*/

public class Ejercicio7 {
    public static void main(String[] args) {
        final int[] notas = {10,6,7,5,8};
        int nroNota = 0;
        int acumulado = 0;

        System.out.println("NOTAS CALCULATOR");
        System.out.println("------------------");

        for (int nota : notas){
            nroNota =  nroNota + 1;
            System.out.print(nota + "-");
            acumulado = acumulado + nota;
        }

        int promedio = acumulado/nroNota;

        System.out.println(promedio);

        if (promedio >= 6){
            System.out.println("APROBADO");
        }
        else{
            System.out.println("DESAPROBADO");
        }

    }
}
