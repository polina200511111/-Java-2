// Имя файла: матрица.java

import java.util.Random;

public class матрица {  // ← Изменили здесь
    public static void main(String[] args) {
        // Параметры матрицы (можно изменить)
        int rows = 5;           // количество строк
        int cols = 4;           // количество столбцов
        double threshold = 50;   // пороговое значение
        int minRandom = 0;       // минимум случайных чисел
        int maxRandom = 100;     // максимум случайных чисел
        
        // Создание матрицы
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        
        // Заполнение матрицы случайными числами
        System.out.println("Сгенерированная матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(maxRandom - minRandom + 1) + minRandom;
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
        
        // Анализ матрицы
        System.out.println("\nАнализ (пороговое значение = " + threshold + "):");
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < threshold) {
                    count++;
                }
            }
            System.out.println("Строка " + (i + 1) + ": " + count + 
                             " элементов < " + threshold);
        }
    }
}