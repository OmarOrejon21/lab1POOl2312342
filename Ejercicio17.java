import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorNumeros = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Ingresa un número (introduce un número negativo para finalizar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            contadorNumeros++;

            if (numero % 2 != 0) {
                sumaImpares += numero;
                contadorImpares++;
            } else {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
        }

        scanner.close();

        if (contadorNumeros == 0) {
            System.out.println("No se ha introducido ningún número.");
        } else {
            System.out.println("Se han introducido " + contadorNumeros + " números.");
            System.out.println("La media de los impares es: " + (double) sumaImpares / contadorImpares);

            if (mayorPar != Integer.MIN_VALUE) {
                System.out.println("El mayor de los números pares es: " + mayorPar);
            } else {
                System.out.println("No se han introducido números pares.");
            }
        }
    }
}




































