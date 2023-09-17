import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en euros: ");
        double euros = scanner.nextDouble();

        scanner.close();

        // Factor de conversión de euros a pesetas (1 euro = 166.386 pesetas)
        double factorConversion = 166.386;

        double pesetas = euros * factorConversion;

        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas.");
    }
}










































