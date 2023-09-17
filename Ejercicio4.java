import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de soles a convertir: ");
        double soles = scanner.nextDouble();

        scanner.close();

        double tasaConversion = 0.25; // 1 sol equivale a 0.25 euros

        double euros = soles * tasaConversion;

        System.out.println(soles + " soles equivalen a " + euros + " euros.");
    }
}












































