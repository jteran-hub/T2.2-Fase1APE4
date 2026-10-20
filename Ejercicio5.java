class Libro {
    String titulo;
    String autor;
    boolean disponible;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {

        Libro l1 = new Libro("Don Quijote", "Cervantes");
        Libro l2 = new Libro("El Principito", "Saint-Exupery");
        Libro l3 = new Libro("La Odisea", "Homero");
        Libro l4 = new Libro("Cien Anos de Soledad", "Garcia Marquez");

        Libro[] libros = {l1, l2, l3, l4};

        Socio s1 = new Socio("Maxim");
        Socio s2 = new Socio("Clara");

        l1.disponible = false;
        l2.disponible = false;
        s1.librosPrestados += 2;

        l3.disponible = false;
        s2.librosPrestados++;

        System.out.println("ESTADO DE LOS LIBROS");

        int disponibles = 0;

        for (Libro libro : libros) {
            System.out.println(
                libro.titulo + " : " +
                (libro.disponible ? "Disponible" : "Prestado")
            );

            if (libro.disponible) {
                disponibles++;
            }
        }

        System.out.println("\nSOCIOS");

        System.out.println(
            s1.nombre + " : " + s1.librosPrestados
        );

        System.out.println(
            s2.nombre + " : " + s2.librosPrestados
        );

        System.out.println(
            "\nLibros disponibles: " + disponibles
        );
    }
}
