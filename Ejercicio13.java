import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero (positivo o negativo) de hasta 5 dígitos: ");
        int numero = scanner.nextInt();

        scanner.close();

        int numAbsoluto = Math.abs(numero);
        int numDigitos = (numAbsoluto == 0) ? 1 : (int) Math.log10(numAbsoluto) + 1;

        System.out.println("El número " + numero + " tiene " + numDigitos + " dígitos.");
    }
}



















































