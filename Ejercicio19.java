import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura de la letra L: ");
        int altura = scanner.nextInt();

        scanner.close();

        if (altura < 2) {
            System.out.println("La altura debe ser mayor o igual a 2.");
        } else {
            System.out.println("Letra L con altura " + altura + ":");

            for (int i = 0; i < altura; i++) {
                if (i < altura - 1) {
                    System.out.println("*");
                } else {
                    for (int j = 0; j < (altura / 2) + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}






































