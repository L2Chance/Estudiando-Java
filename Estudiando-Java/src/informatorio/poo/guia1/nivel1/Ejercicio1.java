/*Sistema de Canciones
● Crear una clase Canción con título, artista y duración. Permitir crear objetos y
mostrar la información.*/

package informatorio.poo.guia1.nivel1;

public class Ejercicio1 {
    public static void main(String[] args) {

    }
}

class Cancion{
    int titulo;
    int artista;
    int duracion;

    public Cancion(int titulo, int artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getArtista() {
        return artista;
    }

    public void setArtista(int artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}


