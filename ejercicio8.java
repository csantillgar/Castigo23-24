import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] numbers = readNumbers();

        if (numbers.length == 0) {
            System.out.println("No se introdujeron números.");
            return;
        }

        double average = calculateAverage(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("La media de los números introducidos es: " + average);
        System.out.println("El mínimo de los números introducidos es: " + min);
        System.out.println("El máximo de los números introducidos es: " + max);
    }

    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce números enteros (introduce 0 para terminar):");

        int[] numbers = new int[0];
        int index = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            int[] temp = new int[index + 1];
            System.arraycopy(numbers, 0, temp, 0, numbers.length);
            temp[index] = num;
            numbers = temp;
            index++;
        }

        scanner.close();
        return numbers;
    }

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static int findMin(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MAX_VALUE;
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
