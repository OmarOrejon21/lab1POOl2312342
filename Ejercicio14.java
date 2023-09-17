import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día de la semana (1:lunes, 2:martes, ..., 5:viernes): ");
        int diaSemana = scanner.nextInt();

        System.out.print("Ingresa la hora (horas y minutos en formato HHMM): ");
        int horaMinutos = scanner.nextInt();

        scanner.close();

        int minutosHastaFinDeSemana = 0;
        
        if (diaSemana == 1) { // lunes
            minutosHastaFinDeSemana = (4 * 24 * 60) + (15 * 60) - horaMinutos;
        } else if (diaSemana == 2) { // martes
            minutosHastaFinDeSemana = (3 * 24 * 60) + (15 * 60) - horaMinutos;
        } else if (diaSemana == 3) { // miércoles
            minutosHastaFinDeSemana = (2 * 24 * 60) + (15 * 60) - horaMinutos;
        } else if (diaSemana == 4) { // jueves
            minutosHastaFinDeSemana = (1 * 24 * 60) + (15 * 60) - horaMinutos;
        } else if (diaSemana == 5) { // viernes
            minutosHastaFinDeSemana = (15 * 60) - horaMinutos;
        }

        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");
    }
}




















































