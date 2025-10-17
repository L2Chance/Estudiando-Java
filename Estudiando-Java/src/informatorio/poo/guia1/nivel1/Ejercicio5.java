package informatorio.poo.guia1.nivel1;

import java.util.Scanner;

public class Ejercicio5 {
}

class Persona{
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Cuenta{
    Persona persona;
    int saldo;
    Scanner scanner = new Scanner(System.in);

    public void depositarSaldo(){
        int saldoADepositar = scanner.nextInt();
        this.saldo = this.saldo + saldoADepositar;

    }

    public void extrarSaldo(){
        int saldoAExtraer = scanner.nextInt();
        this.saldo = this.saldo - saldoAExtraer;
    }

}
