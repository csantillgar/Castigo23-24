import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de números enteros positivos. Introduce un número negativo para finalizar:");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Introduce un número: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("El mínimo es: " + min);
            System.out.println("El máximo es: " + max);
        }

        scanner.close();
    }
}
