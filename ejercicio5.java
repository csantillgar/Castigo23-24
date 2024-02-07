public class ejercicio5 {
    public static void main(String[] args) {
        int n = 10;

        int[][] multiplicationTables = generateMultiplicationTables(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + multiplicationTables[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMultiplicationTables(int n) {
        int[][] tables = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tables[i][j] = i * j;
            }
        }

        return tables;
    }
}
