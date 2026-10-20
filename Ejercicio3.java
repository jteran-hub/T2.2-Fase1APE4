class Mascota {
    String nombre;
    String especie;
    int edad;

    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {

        Mascota mascota1 = new Mascota("Chester", "Perro", 3);

        System.out.println("DATOS INICIALES");
        mascota1.mostrarDatos();

        Mascota mascota2 = mascota1;

        mascota2.nombre = "Max";
        mascota2.edad = 4;

        System.out.println("\nDATOS DESPUES DEL CAMBIO");

        System.out.println("Mascota 1:");
        mascota1.mostrarDatos();

        System.out.println("\nMascota 2:");
        mascota2.mostrarDatos();

        System.out.println("\n¿Son el mismo objeto? "
                + (mascota1 == mascota2));
    }
}
