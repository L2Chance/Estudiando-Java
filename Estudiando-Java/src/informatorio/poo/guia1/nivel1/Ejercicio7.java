package informatorio.poo.guia1.nivel1;

/*Clase Jugador con nombre, nivel y puntos. Método para subir de nivel.*/

public class Ejercicio7 {
}

class Jugador{
    String nombre;
    int nivel = 0;
    int puntos = 0;

    public Jugador(String nombre, int nivel, int puntos) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntos = puntos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void atacar(){
        System.out.println("¡GOLPE!");
        this.puntos = this.puntos + 1;
    }

    public void canjearPuntos(){
        if (this.puntos >= 10){
            System.out.println("¡FELICIDADES, HAS SUBIDO DE NIVEL!");
            this.nivel = this.nivel + 1;
        }
        else{
            System.out.println("No tienes los puntos suficientes para subir de nivel");
        }
    }

}