import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura en metros desde la que caerá el objeto: ");
        double altura = scanner.nextDouble();

        scanner.close();

        double gravedad = 9.81;

        double tiempo = Math.sqrt((2 * altura) / gravedad);

        System.out.println("El objeto tardará " + tiempo + " segundos en caer desde una altura de " + altura + " metros.");
    }
}
















































