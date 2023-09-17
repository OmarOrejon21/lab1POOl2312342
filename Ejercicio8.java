import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();

        scanner.close();

        String saludo;
        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos días";
        } else if (hora >= 13 && hora <= 20) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println(saludo);
    }
}















































