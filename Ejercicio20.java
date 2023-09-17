import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        long numero = scanner.nextLong();

        scanner.close();

        long sumaPares = 0;
        StringBuilder digitosPares = new StringBuilder();

        numero = Math.abs(numero);

        String numeroStr = Long.toString(numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            char digitoChar = numeroStr.charAt(i);
            int digito = Character.getNumericValue(digitoChar);

            if (digito % 2 == 0) {
                digitosPares.append(digitoChar);
                sumaPares += digito; 
            }
        }

        if (digitosPares.length() > 0) {
            System.out.println("Dígitos pares: " + digitosPares.toString());
            System.out.println("Suma de dígitos pares: " + sumaPares);
        } else {
            System.out.println("No hay dígitos pares en el número.");
        }
    }
}







































