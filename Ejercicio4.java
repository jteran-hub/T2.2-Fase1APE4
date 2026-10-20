class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Carlos", 200);
        Cuenta c2 = new Cuenta("Maria", 350);

        int meses1 = 0;
        int meses2 = 0;

        System.out.println("CUENTA DE AHORRO");

        while (c1.saldo < 500) {
            c1.saldo += 50;
            meses1++;

            System.out.println(
                c1.titular + " : " + c1.saldo
            );
        }

        System.out.println();

        while (c2.saldo < 500) {
            c2.saldo += 50;
            meses2++;

            System.out.println(
                c2.titular + " : " + c2.saldo
            );
        }

        System.out.println("\nRESUMEN");
        System.out.println(
            c1.titular + " necesitó " + meses1 + " meses"
        );
        System.out.println(
            c2.titular + " necesitó " + meses2 + " meses"
        );
    }
}
