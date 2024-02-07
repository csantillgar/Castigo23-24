import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int num = scanner.nextInt();

        int[] primeFactors = primeFactorization(num);

        System.out.print("Los factores primos de " + num + " son: ");
        for (int i = 0; i < primeFactors.length; i++) {
            System.out.print(primeFactors[i]);
            if (i < primeFactors.length - 1) {
                System.out.print(" * ");
            }
        }

        scanner.close();
    }

    public static int[] primeFactorization(int num) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }

        int[] primeFactors = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            primeFactors[i] = factors.get(i);
        }

        return primeFactors;
    }
}
