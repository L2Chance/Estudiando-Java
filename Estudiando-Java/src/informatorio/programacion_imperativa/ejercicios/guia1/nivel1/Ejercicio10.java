package informatorio.programacion_imperativa.ejercicios.guia1.nivel1;

/*Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.*/

public class Ejercicio10 {
    public static void main(String[] args) {
        int num = 3;
        int potencia = num * num;
        int cubo = num * num * num;
        System.out.println("Número: " + num);
        System.out.println("Potencia: " + potencia);
        System.out.println("Cubo: " + cubo);
    }
}
