package informatorio.poo.guia1.nivel1;

/*Crear clase Libro y clase Autor. Relacionarlas (1 autor → muchos libros).*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
}

class Autor{
    String nombre;
    List<Libro> listaDeLibros = new ArrayList<Libro>();

    public Autor(String nombre, List<Libro> listaDeLibros) {
        this.nombre = nombre;
        this.listaDeLibros = listaDeLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getListaDeLibros() {
        return listaDeLibros;
    }

    public void setListaDeLibros(List<Libro> listaDeLibros) {
        this.listaDeLibros = listaDeLibros;
    }
}

class Libro{
    String titulo;
    String anioSalida;

    public Libro(String titulo, String anioSalida) {
        this.titulo = titulo;
        this.anioSalida = anioSalida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(String anioSalida) {
        this.anioSalida = anioSalida;
    }
}
