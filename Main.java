public class Main {
    public static void main(String[] args) {
        // Способ 1: Создать объект через конструктор с параметрами
        Decanat decanat1 = new Decanat("Информационных технологий", "305", 3, "+7(495)123-45-67", "Иванов");
        
        // Вывести информацию
        System.out.println("=== Деканат 1 ===");
        System.out.println(decanat1);
        System.out.println();
        
        // Способ 2: Создать пустой объект и заполнить через сеттеры
        Decanat decanat2 = new Decanat();
        decanat2.setNameFaculty("Экономический");
        decanat2.setRoom("215");
        decanat2.setCorps(1);
        decanat2.setTelephone("+7(495)987-65-43");
        decanat2.setNameDean("Петрова");
        
        System.out.println("=== Деканат 2 ===");
        System.out.println(decanat2);
        System.out.println();
        
        // Показать работу геттеров
        System.out.println("=== Использование геттеров ===");
        System.out.println("Декан факультета 1: " + decanat1.getNameDean());
        System.out.println("Телефон факультета 2: " + decanat2.getTelephone());
        
        // Изменить данные через сеттеры
        decanat1.setRoom("410");
        System.out.println("\n=== После изменения аудитории ===");
        System.out.println(decanat1);
    }
}