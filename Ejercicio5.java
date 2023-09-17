import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa las horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        scanner.close();

        double tasaPorHora = 12.0;

        double salarioSemanal = horasTrabajadas * tasaPorHora;

        System.out.println("El salario semanal del empleado es: " + salarioSemanal + " euros.");
    }
}













































