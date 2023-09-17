import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en Megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        scanner.close();

        double factorConversion = 1024.0;

        double kilobytes = megabytes * factorConversion;

        System.out.println(megabytes + " Megabytes (MB) equivalen a " + kilobytes + " Kilobytes (KB).");
    }
}














































