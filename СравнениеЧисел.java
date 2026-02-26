import java.util.Scanner;  // подключаем Scanner для ввода

public class СравнениеЧисел {
    public static void main(String[] args) {
        // создаем сканер для ввода
        Scanner scanner = new Scanner(System.in);
        
        // первое ч
        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();
        
        // второе ч
        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();
        
        // ищем большее
        double большееЧисло;
        if (x > y) {
            большееЧисло = x;
            System.out.println("Первое число (" + x + ") больше второго (" + y + ")");
        } else if (y > x) {
            большееЧисло = y;
            System.out.println("Второе число (" + y + ") больше первого (" + x + ")");
        } else {
            большееЧисло = x;
            System.out.println("Числа равны: " + x);
        }
        
        // в квадрате
        double результат = большееЧисло * большееЧисло;
        System.out.println("Большее число: " + большееЧисло);
        System.out.println("Результат возведения в квадрат: " + результат);
    
        scanner.close();
    }
}