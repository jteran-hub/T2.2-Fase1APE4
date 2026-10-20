class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
}

public class Ejercicio1 {
    public static void main(String[] args) {

        int aprobados = 0;

        Estudiante e1 = new Estudiante();
        e1.nombre = "Carlos";
        e1.nota1 = 8;
        e1.nota2 = 7;
        e1.nota3 = 9;
        e1.promedio = (e1.nota1 + e1.nota2 + e1.nota3) / 3;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Ana";
        e2.nota1 = 6;
        e2.nota2 = 5;
        e2.nota3 = 6;
        e2.promedio = (e2.nota1 + e2.nota2 + e2.nota3) / 3;

        Estudiante e3 = new Estudiante();
        e3.nombre = "Pedro";
        e3.nota1 = 4;
        e3.nota2 = 3;
        e3.nota3 = 5;
        e3.promedio = (e3.nota1 + e3.nota2 + e3.nota3) / 3;

        Estudiante e4 = new Estudiante();
        e4.nombre = "Maria";
        e4.nota1 = 9;
        e4.nota2 = 8;
        e4.nota3 = 10;
        e4.promedio = (e4.nota1 + e4.nota2 + e4.nota3) / 3;

        Estudiante e5 = new Estudiante();
        e5.nombre = "Luis";
        e5.nota1 = 7;
        e5.nota2 = 6;
        e5.nota3 = 8;
        e5.promedio = (e5.nota1 + e5.nota2 + e5.nota3) / 3;

        Estudiante[] estudiantes = {e1, e2, e3, e4, e5};

        for (Estudiante e : estudiantes) {

            System.out.print(e.nombre + " : ");
            System.out.printf("%.2f", e.promedio);

            if (e.promedio >= 7) {
                System.out.println(" Aprobado");
                aprobados++;
            } else if (e.promedio >= 5) {
                System.out.println(" Supletorio");
            } else {
                System.out.println(" Reprobado");
            }
        }

        System.out.println("Total de aprobados: " + aprobados);
    }
}
