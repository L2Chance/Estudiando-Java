package informatorio.programacion_imperativa.ejercicios.guia1.nivel1;

/*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? */

/*Java utiliza las comillas dobles ("") para encerrar Strings. Esta es una regla, como sucede con las palabras
reservadas. Para encerrar caracteres, se utilizan las comillas simples (''). Se hace la diferenciación porque los
Strings en Java son objetos, mientras que los caracteres son datos primitivos.*/

public class Ejercicio4 {
    public static void main(String[] args) {
        char uno = 'L';
        char dos = 'a';
        char tres = 'u';
        char cuatro = 't';
        char cinco = 'a';
        char seis = 'r';
        char siete = 'o';

        System.out.println ("" + uno + dos + tres + cuatro + cinco + seis + siete);
    }
}
