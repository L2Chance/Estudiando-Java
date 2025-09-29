package informatorio.programacion_imperativa.ejercicios.guia1.nivel2;

/*5. Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla.*/

public class Ejercicio5 {
    public static void main(String[] args) {
        double pesoEnLibras = 177;
        final double libraEnKilogramo = 0.453592;
        final double pesoEnKilogramos = pesoEnLibras*libraEnKilogramo;

         System.out.println("Su peso en kilogramos es: " + pesoEnKilogramos);

    }
}
