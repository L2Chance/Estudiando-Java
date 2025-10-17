package informatorio.DesafioCodeChadsAcademyPOO.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void verEstudianteConPromedioMasAlto() {

        double promedio = 0;
        double promedioMasAlto = 0;
        String estudiantePromedioMasAlto = "estudiante";


        int acumulador = 0;

        for (Estudiante estudiante : this.listaEstudiantes) {
            for (int nota : estudiante.getListaNotas()) {
                acumulador = acumulador + nota;
            }

            promedio = (double) acumulador / 5;
            acumulador = 0;

            if (promedio > promedioMasAlto) {
                promedioMasAlto = promedio;
                estudiantePromedioMasAlto = estudiante.getNombre();
            }

        }

        System.out.println("El estudiante con el mayor promedio es: " + estudiantePromedioMasAlto + " Con " + promedioMasAlto + " De promedio");

    }

    public void verEstudianteMasRegular(){

        double desviacion = 0;
        double desviacionMasBaja = 1000;
        String estudianteDesviacionMasBaja = "estudiante";

        for (Estudiante estudiante : this.listaEstudiantes) {
            desviacion = calcularDesviacion(estudiante.getListaNotas().get(0),
                    estudiante.getListaNotas().get(1),
                    estudiante.getListaNotas().get(2),
                    estudiante.getListaNotas().get(3),
                    estudiante.getListaNotas().get(4));

            if (desviacion < desviacionMasBaja){
                desviacionMasBaja = desviacion;
                estudianteDesviacionMasBaja = estudiante.getNombre();
            }
        }

        System.out.println("El estudiante más regular fue " + estudianteDesviacionMasBaja + " con una variacion de: " + desviacionMasBaja);
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

    public void verPeorRendimientoEnTerceraPrueba(){
        int tercerNotaActual;
        double peorTerceraNota = 100;
        String estudiantePeorTerceraNota = "estudiante";

        for (Estudiante estudiante : this.listaEstudiantes) {

            tercerNotaActual = estudiante.getListaNotas().get(2);

            if (tercerNotaActual < peorTerceraNota){
                peorTerceraNota = tercerNotaActual;
                estudiantePeorTerceraNota = estudiante.getNombre();
            }
        }

        System.out.println("El estudiante con peor tercera nota es: " + estudiantePeorTerceraNota + " con: " + peorTerceraNota);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
