class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {

        Producto p1 = new Producto("Arroz", 1.50, 10);
        Producto p2 = new Producto("Leche", 1.25, 8);
        Producto p3 = new Producto("Pan", 0.25, 6);
        Producto p4 = new Producto("Azucar", 1.00, 4);

        Producto[] productos = {p1, p2, p3, p4};

        System.out.println("INVENTARIO DE LA TIENDA");

        for (Producto p : productos) {
            System.out.println(p.nombre + " : $" + p.precio);
        }

        p1.stock -= 3;
        p2.stock -= 3;

        System.out.println("\nINVENTARIO DESPUES DE LAS VENTAS");

        double valorTotal = 0;

        for (Producto p : productos) {
            System.out.print(p.nombre + " : " + p.stock + " unidades");

            if (p.stock < 5) {
                System.out.print(" - Reponer");
            }

            System.out.println();

            valorTotal += p.precio * p.stock;
        }

        System.out.println("\nValor total del inventario: $" + valorTotal);
    }
}
