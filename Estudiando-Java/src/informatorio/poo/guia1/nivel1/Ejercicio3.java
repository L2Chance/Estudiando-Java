package informatorio.poo.guia1.nivel1;

/*Clase Vehiculo con marca, modelo y año. Método para mostrar detalles.*/

public class Ejercicio3 {
}

class Vehiculo{
    String marca;
    String modelo;
    int anio;

    public Vehiculo(String marca, int anio, String modelo) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }

    public void mostrarDetalles(){
        System.out.println("Detalles del vehiculo");
        System.out.println("marca " + this.getMarca() );
        System.out.println("modelo " + this.getModelo() );
        System.out.println("año " + this.getAnio() );
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
