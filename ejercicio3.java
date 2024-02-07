import java.util.Arrays;

public class ejercicio3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] multiplesOfFive = getMultiplesOfFive(begin, end);
        System.out.println("Los múltiplos de 5 entre " + begin + " y " + end + " son: " + Arrays.toString(multiplesOfFive));

        int sum = sumArray(multiplesOfFive);
        System.out.println("La suma de los múltiplos de 5 es: " + sum);
        System.out.println("El número de múltiplos de 5 es: " + multiplesOfFive.length);
    }

    public static int[] getMultiplesOfFive(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }

        int[] multiplesOfFive = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplesOfFive[index] = i;
                index++;
            }
        }

        return multiplesOfFive;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
