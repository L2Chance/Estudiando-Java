package informatorio.poo.guia1.nivel1;

/*Crear una clase Contacto con nombre, email y teléfono. Instanciar y mostrar
una lista de 3 contactos.*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Contacto Lautaro = new Contacto("Lautaro", 243242323, "Lautydos@gmail.com");
        Contacto Jorge = new Contacto("Jorge", 34334343, "Jorgedos@gmail.com");
        Contacto Sofia = new Contacto("Sofía", 343433434, "Sofíados@gmail.com");

        List<Contacto> listaContactos = new ArrayList<Contacto>();

        listaContactos.add(Lautaro);
        listaContactos.add(Jorge);
        listaContactos.add(Sofia);

        for (Contacto contacto : listaContactos){
            System.out.println(contacto.getNombre());
        }

    }
}

class Contacto{
    String nombre;
    String email;
    int telefono;

    public Contacto(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
