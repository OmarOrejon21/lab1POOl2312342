import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la nota del primer examen (0-10): ");
        double notaPrimerExamen = scanner.nextDouble();
        System.out.print("Ingresa la media deseada (0-10): ");
        double mediaDeseada = scanner.nextDouble();

        scanner.close();

        if (notaPrimerExamen < 0 || notaPrimerExamen > 10 || mediaDeseada < 0 || mediaDeseada > 10) {
            System.out.println("Por favor, ingresa notas válidas en el rango de 0 a 10.");
        } else {
            double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

            if (notaSegundoExamen > 10) {
                System.out.println("No es posible alcanzar la media deseada con las notas proporcionadas en el primer examen.");
            } else {
                System.out.println("Para alcanzar la media deseada, necesitas obtener una nota de " + notaSegundoExamen + " en el segundo examen.");
            }
        }
    }
}














































