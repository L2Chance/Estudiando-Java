package informatorio.poo.guia1.nivel1;

import java.util.*;

public class Ejercicio6 {
}

class Tienda{
    String nombre;
    List<Producto> listaProductos = new ArrayList<Producto>();
    Scanner scanner = new Scanner(System.in);

    public void AgregarProducto(){
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        int precio = scanner.nextInt();

        Producto nuevoProducto = new Producto(nombre, precio);

        this.listaProductos.add(nuevoProducto);
    }

    public void listarProductos(){
        for (Producto producto : listaProductos){
            System.out.println(producto.getNombre());
        }
    }
}

class Producto{
    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
