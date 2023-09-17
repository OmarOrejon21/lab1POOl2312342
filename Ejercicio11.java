import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la hora (en formato HH:MM): ");
        String entrada = scanner.nextLine();

        scanner.close();

        try {
            String[] partes = entrada.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            int segundosHastaMedianoche = (24 - horas - 1) * 3600 + (60 - minutos) * 60;

            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a la medianoche.");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Entrada inválida. Por favor, ingresa la hora en el formato correcto (HH:MM).");
        }
    }
}

















































