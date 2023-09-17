import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int combinacion = 1234;

        int intentosMaximos = 4;

        Scanner scanner = new Scanner(System.in);

        int intentos = 0;

        while (intentos < intentosMaximos) {
            System.out.print("Ingresa la combinación de 4 cifras: ");
            int intento = scanner.nextInt();

            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break; 
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos++;
                if (intentos < intentosMaximos) {
                    System.out.println("Te quedan " + (intentosMaximos - intentos) + " intentos.");
                }
            }
        }

        scanner.close();

        if (intentos == intentosMaximos) {
            System.out.println("Has agotado todos los intentos. La caja fuerte permanece cerrada.");
        }
    }
}





















































