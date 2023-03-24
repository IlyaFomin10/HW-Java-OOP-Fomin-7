public class Main {

    public static void main(String[] args) {
        
        Employee Employee1 = new Employee("Станислав", "Кобяков", "ПТО", 50000);
        Employee Employee2 = new Employee("Станислав", "Иванов", "Сметный", 45000);
        Employee Employee3 = new Employee("Ирина", "Андреева", "Бухгалтерия", 40000);
        Employee Employee4 = new Employee("Ирина", "Андреева", "ГМТО", 35000);

        System.out.println(Employee1);
        System.out.println(Employee2);
        System.out.println(Employee3);
        System.out.println(Employee4);
    
        System.out.println("Результат сравнения по equals: " + Employee1.equals(Employee2));
        System.out.println("Результат сравнения по equals: " + Employee3.equals(Employee4));
     
        System.out.println("Результат сравнения по hashCode: " + (Employee1.hashCode() == Employee2.hashCode()));
        System.out.println("Результат сравнения по hashCode: " + (Employee3.hashCode() == Employee4.hashCode()));
        }
}