import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número límite: ");
        int limite = scanner.nextInt();

        System.out.print("Ingresa el número divisor: ");
        int divisor = scanner.nextInt();

        scanner.close();

        System.out.println("Números enteros positivos menores a " + limite + " que no son divisibles por " + divisor + ":");

        for (int i = 1; i < limite; i++) {
            if (i % divisor != 0) {
                System.out.println(i);
            }
        }
    }
}





































