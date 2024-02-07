import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        int[] vector1 = readVector(dimension);
        int[] vector2 = readVector(dimension);

        int dotProduct = calculateDotProduct(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + dotProduct);

        scanner.close();
    }

    public static int[] readVector(int dimension) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los elementos del vector separados por espacios:");

        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    public static int calculateDotProduct(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma dimensión");
        }

        int dotProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        return dotProduct;
    }
}
