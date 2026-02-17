import java.util.Random;
import java.util.Scanner;

public class массив {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        try {
            // Ввод размеров массива
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            
            // Ввод диапазона случайных чисел
            System.out.print("Введите минимальное значение: ");
            int minValue = scanner.nextInt();
            
            System.out.print("Введите максимальное значение: ");
            int maxValue = scanner.nextInt();
            
            // Создание и заполнение массива
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
            }
            
            // Вывод исходного массива
            System.out.println("\nИсходный массив:");
            printArray(array);
            
            // Переворот массива
            reverseArray(array);
            
            // Вывод измененного массива
            System.out.println("\nМассив после переворота:");
            printArray(array);
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    // Метод для переворота массива
    public static void reverseArray(int[] arr) {
        int left = 0;           // указатель на начало
        int right = arr.length - 1;  // указатель на конец
        
        while (left < right) {
            // Меняем местами элементы
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Двигаем указатели навстречу друг другу
            left++;
            right--;
        }
    }
    
    // Метод для вывода массива
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}