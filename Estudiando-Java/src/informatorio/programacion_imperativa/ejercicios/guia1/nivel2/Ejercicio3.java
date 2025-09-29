package informatorio.programacion_imperativa.ejercicios.guia1.nivel2;

/*Caracteres: Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar"" en el char?
¿Qué es unicode?*/

public class Ejercicio3 {
    public static void main(String[] args) {
        char[] nombre = {'L', 'A', 'U', 'T', 'A', 'R','O'};

        for (char caracter : nombre){
            System.out.println(caracter);
        }

        /*Unicode es un standart que asigna un número único a cada caracter, sin importar el lenguaje,
        *la plataforma o el programa de software. Su idea es brindar una forma universal de manejar
        * estos datos textuales*/
    }
}
