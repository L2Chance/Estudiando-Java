package informatorio.DesafioCodeChadsAcademyPOO.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private List<Integer> listaNotas = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void subirNotas(Scanner scanner) {
        if (this.listaNotas.isEmpty()) {
            int nota1;
            int nota2;
            int nota3;
            int nota4;
            int nota5;

            System.out.println("Ingrese la primera nota");
            nota1 = scanner.nextInt();

            System.out.println("Ingrese la segunda nota");
            nota2 = scanner.nextInt();

            System.out.println("Ingrese la tercera nota");
            nota3 = scanner.nextInt();

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

            this.listaNotas.add(nota1);
            this.listaNotas.add(nota2);
            this.listaNotas.add(nota3);
            this.listaNotas.add(nota4);
            this.listaNotas.add(nota5);
        } else {
            System.out.println("El estudiante ya tiene notas subidas");
        }
    }

    public void verificarAprobacion(){
        if (this.listaNotas.get(0) >= 60 && this.listaNotas.get(1) >= 60 && this.listaNotas.get(2) >= 60 && this.listaNotas.get(3) >= 60 && this.listaNotas.get(4) >= 60) {
            System.out.println("Aprobaste todas. ¡Backend Sensei!");
        } else {
            if (this.listaNotas.get(0) < 60 && this.listaNotas.get(1) < 60 && this.listaNotas.get(2) < 60 && this.listaNotas.get(3) < 60 && this.listaNotas.get(4) < 60) {
                System.out.println("No aprobaste ninguna. ¡Sos un clon de frontend!");
            } else {
                System.out.println("Algunas aprobadas. Sos un refactor en progreso");
            }
        }
    }

    public void encontrarMayorVariacion(){
        int variacion1 = Math.abs(this.listaNotas.get(0) - this.listaNotas.get(1));
        int variacion2 = Math.abs(this.listaNotas.get(1) - this.listaNotas.get(2));
        int variacion3 = Math.abs(this.listaNotas.get(2) - this.listaNotas.get(3));
        int variacion4 = Math.abs(this.listaNotas.get(3) - this.listaNotas.get(4));

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
        if (this.listaNotas.get(0) < this.listaNotas.get(1) && this.listaNotas.get(1) < this.listaNotas.get(2) && this.listaNotas.get(2) < this.listaNotas.get(3) && this.listaNotas.get(3) < this.listaNotas.get(4)) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento");
        }
    }

    public void ordenarNotas() {
        for (int i = 0; i < this.listaNotas.size() - 1; i++) {
            for (int j = 0; j < (this.listaNotas.size() - 1 - i); j++) {

                if (this.listaNotas.get(j) < this.listaNotas.get(j + 1)) {

                    int aux = this.listaNotas.get(j);

                    this.listaNotas.set(j, this.listaNotas.get(j + 1));

                    this.listaNotas.set(j + 1, aux); // ¡Usar .set()!
                }
            }
        }

        // Imprimir todos los elementos, no solo los 5 primeros
        for (int i = 0; i < this.listaNotas.size(); i++) {
            System.out.println(this.listaNotas.get(i));
        }
    }

    public void mostrarEvaluacionFinal(){
        int acumulador = 0;

        for (int nota : this.listaNotas) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }
}
