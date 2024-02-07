import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        int[][] symmetricMatrix = createSymmetricMatrix(dimension);

        System.out.println("Matriz cuadrada simétrica generada:");
        printMatrix(symmetricMatrix);

        scanner.close();
    }

    public static int[][] createSymmetricMatrix(int dimension) {
        int[][] matrix = new int[dimension][dimension];
        Random random = new Random();

        // Llenar la mitad superior de la matriz con números aleatorios
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int randomNumber = random.nextInt(100); // Generar un número aleatorio entre 0 y 99
                matrix[i][j] = randomNumber;
                // Reflejar el número en la mitad inferior para mantener la simetría
                matrix[j][i] = randomNumber;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num); // Alineación de los números para que la matriz se vea ordenada
            }
            System.out.println();
        }
    }
}


