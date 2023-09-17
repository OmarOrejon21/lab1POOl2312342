import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        scanner.close();

        boolean esPar = numero % 2 == 0;

        boolean esDivisibleEntre5 = numero % 5 == 0;

        if (esPar && esDivisibleEntre5) {
            System.out.println(numero + " es un número par y divisible entre 5.");
        } else if (esPar) {
            System.out.println(numero + " es un número par pero no es divisible entre 5.");
        } else if (esDivisibleEntre5) {
            System.out.println(numero + " no es un número par, pero es divisible entre 5.");
        } else {
            System.out.println(numero + " no es un número par y no es divisible entre 5.");
        }
    }
}


















































