import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        scanner.close();

        double tasaPorHoraNormal = 12.0;

        double tasaPorHoraExtra = 16.0;

        int horasNormales = Math.min(horasTrabajadas, 40);
        double salarioHorasNormales = horasNormales * tasaPorHoraNormal;

        int horasExtras = Math.max(horasTrabajadas - 40, 0); 
        double salarioHorasExtras = horasExtras * tasaPorHoraExtra;

        double salarioTotal = salarioHorasNormales + salarioHorasExtras;

        System.out.println("El salario semanal del trabajador es: " + salarioTotal + " soles.");
    }
}
















































