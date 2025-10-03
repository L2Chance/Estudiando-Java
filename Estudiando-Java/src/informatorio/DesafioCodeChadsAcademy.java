package informatorio;

public class DesafioCodeChadsAcademy {

    public static void main(String[] args) {

        int[] estudiante = crearEstudiante(100, 90, 60);

        System.out.println();
        System.out.println("INFORME DE ESTUDIANTE PARTICULAR");
        System.out.println("---------------------");

        ejercicioPunto1(estudiante);
        ejercicioPunto2(estudiante);
        ejercicioPunto3(estudiante);
        ejercicioPunto4(estudiante);
        ejercicioPunto5(estudiante);

        System.out.println();
        System.out.println("INFORME DE CURSO (Punto 6)");
        System.out.println("----------------------------");

        int[][] estudianteClase = crearClaseEstudiantes();

        ejercicioPunto6(estudianteClase);
    }

    static double calcularDesviacion(int nota1, int nota2, int nota3, int nota4, int nota5) {
        double media = (double) (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        double sumaCuadrados = 0;
        sumaCuadrados += Math.pow(nota1 - media, 2);
        sumaCuadrados += Math.pow(nota2 - media, 2);
        sumaCuadrados += Math.pow(nota3 - media, 2);
        sumaCuadrados += Math.pow(nota4 - media, 2);
        sumaCuadrados += Math.pow(nota5 - media, 2);

        double desviacion = Math.sqrt(sumaCuadrados / 5);

        return desviacion;
    }

    static int[] crearEstudiante(int nota1, int nota2, int nota3) {
        int[] estudiante = new int[5];

        int nota4;
        int nota5;

        if (nota3 < 60) {
            nota4 = 100;
        } else {
            nota4 = nota2;
        }

        if (nota1 + nota3 > 150) {
            nota5 = 95;
        } else {
            nota5 = 70;
        }

        estudiante[0] = nota1;
        estudiante[1] = nota2;
        estudiante[2] = nota3;
        estudiante[3] = nota4;
        estudiante[4] = nota5;

        return estudiante;
    }

    static int[][] crearClaseEstudiantes() {
        int[][] estudiantesClase = new int[4][5];

        // Estudiante 1
        estudiantesClase[0] = crearEstudiante(100, 90, 60);

        // Estudiante 2
        estudiantesClase[1] = crearEstudiante(85, 88, 92);

        // Estudiante 3
        estudiantesClase[2] = crearEstudiante(50, 45, 55);

        // Estudiante 4
        estudiantesClase[3] = crearEstudiante(90, 95, 98);

        return estudiantesClase;
    }

    static void ejercicioPunto1(int[] estudiante){
        if (estudiante[0] >= 60 && estudiante[1] >= 60 && estudiante[2] >= 60 && estudiante[3] >= 60 && estudiante[4] >= 60) {
            System.out.println("Aprobaste todas. ¡Backend Sensei!");
        } else {
            if (estudiante[0] < 60 && estudiante[1] < 60 && estudiante[2] < 60 && estudiante[3] < 60 && estudiante[4] < 60) {
                System.out.println("No aprobaste ninguna. ¡Sos un clon de frontend!");
            } else {
                System.out.println("Algunas aprobadas. Sos un refactor en progreso");
            }
        }
    }

    static void ejercicioPunto2(int[] estudiante){
        int variacion1 = Math.abs(estudiante[0] - estudiante[1]);
        int variacion2 = Math.abs(estudiante[1] - estudiante[2]);
        int variacion3 = Math.abs(estudiante[2] - estudiante[3]);
        int variacion4 = Math.abs(estudiante[3] - estudiante[4]);

        if (variacion1 > variacion2 && variacion1 > variacion3 && variacion1 > variacion4) {
            System.out.println("Entre la nota 1 y 2 estuvo la mayor variacion");
        } else {
            if (variacion2 > variacion1 && variacion2 > variacion3 && variacion2 > variacion4) {
                System.out.println("Entre la nota 2 y 3 estuvo la mayor variacion");
            } else {
                if (variacion3 > variacion1 && variacion3 > variacion2 && variacion3 > variacion4) {
                    System.out.println("Entre la nota 3 y 4 estuvo la mayor variacion");
                } else {
                    System.out.println("Entre la nota 4 y 5 estuvo la mayor variacion");
                }
            }
        }
    }

    static void ejercicioPunto3(int[] estudiante){
        if (estudiante[0] < estudiante[1] && estudiante[1] < estudiante[2] && estudiante[2] < estudiante[3] && estudiante[3] < estudiante[4]) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento");
        }
    }

    static void ejercicioPunto4(int[] estudiante){
        for (int i = 0; i < estudiante.length - 1; i++) {
            for (int j = 0; j < (estudiante.length - 1 - i); j++) {
                if (estudiante[j] < estudiante[j + 1]) {
                    int aux = estudiante[j];
                    estudiante[j] = estudiante[j + 1];
                    estudiante[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(estudiante[i]);
        }
    }

    static void ejercicioPunto5(int[] estudiante){
        int acumulador = 0;

        for (int nota : estudiante) {
            acumulador = acumulador + nota;
        }

        if (acumulador < 250) {
            System.out.println("Sos un Normie total :(");
        } else {
            if (acumulador <= 349) {
                System.out.println("Sos SoftChad");
            } else {
                if (acumulador <= 449) {
                    System.out.println("Sos Chad");
                } else {
                    System.out.println("Sos el Chad definitivo");
                }
            }
        }
    }

    static void ejercicioPunto6(int[][] estudiantesClase){

        System.out.println("--- Notas de la Clase ---");
        for (int i = 0; i < estudiantesClase.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < estudiantesClase[i].length; j++) {
                System.out.print(estudiantesClase[i][j] + " ");
            }
            System.out.println();
        }

        int sumaNotas = 0;
        double promedio = 0;
        double promedioMasAlto = 0;
        int estudiantePromedioMasAlto = 0;
        int estudianteDesviacionMasBaja = 0;
        int estudiantePeorTerceraPrueba = 0;
        int peorTerceraNota = 150;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int nota5 = 0;
        double desviacion = 0;
        double desviacionMasBaja = 3000;

        for (int filaEstudiante = 0; filaEstudiante < 4 ; filaEstudiante++){
            for (int columnaNota = 0; columnaNota < 5 ; columnaNota++) {

                switch(columnaNota){

                    case 0: nota1 = estudiantesClase[filaEstudiante][columnaNota];
                        break;
                    case 1: nota2 = estudiantesClase[filaEstudiante][columnaNota];
                        break;
                    case 2: nota3 = estudiantesClase[filaEstudiante][columnaNota];
                        break;
                    case 3: nota4 = estudiantesClase[filaEstudiante][columnaNota];
                        break;
                    case 4: nota5 = estudiantesClase[filaEstudiante][columnaNota];
                }

                sumaNotas = sumaNotas + estudiantesClase[filaEstudiante][columnaNota];
            }
            promedio = (double) sumaNotas /5;
            desviacion = calcularDesviacion(nota1, nota2, nota3, nota4, nota5);

            if (nota3 < peorTerceraNota){
                peorTerceraNota = nota3;
                estudiantePeorTerceraPrueba = filaEstudiante + 1;
            }

            if (desviacion < desviacionMasBaja){
                desviacionMasBaja = desviacion;
                estudianteDesviacionMasBaja = filaEstudiante + 1;
            }


            if (promedio > promedioMasAlto){
                promedioMasAlto = promedio;
                estudiantePromedioMasAlto = filaEstudiante + 1;
            }

            sumaNotas = 0;
        }

        System.out.println("El estudiante " + estudiantePromedioMasAlto + " es el del promedio más alto con " + promedioMasAlto);
        System.out.println("El estudiante " + estudianteDesviacionMasBaja + " fue el más regular con una desviación de " + desviacionMasBaja);
        System.out.println("El estudiante " + estudiantePeorTerceraPrueba + " Fue el que peor tercera prueba hizo con una calificación de " + peorTerceraNota);
    }

}
