public class Main {
    public static void main(String[] args) {
        System.out.println("Sixth homework");
        System.out.println("Task one");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task two");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Task three");
        for (int i = 0; i <= 17; i= i + 2) {
            System.out.println(i);
        }

        System.out.println("Task four");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task five");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println("Task six");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Task seven");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Task eight");
        int salary = 29000;
        double total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task nine");
        for (int i = 1; i <= 12; i++) {
            total = total + total * 0.12;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task ten ");
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }
}