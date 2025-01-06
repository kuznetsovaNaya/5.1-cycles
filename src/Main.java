public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("task1");
        int digit = 1;
        for (int i = digit; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("task2");
        int digit = 10;
        for (int i = digit; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("task3");
        int digit = 0;
        for (int i = digit; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("task4");
        int digit = 10;
        for (int i = digit; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("task5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("task6");
        for (int i = 0; i <= 100; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("task7");
        for (int i = 1; i <= 1000; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("task8");
        int bankDeposit = 0;
        int savings = 29000;
        for (int i = 1; i <= 12; i++) {
            bankDeposit = bankDeposit + savings;
            System.out.println("Месяц: " + i + ", накоплений: " + bankDeposit);
        }
    }

    public static void task9() {
        System.out.println("task9");
        float bankDeposit = 0;
        int savings = 29000;
        for (int i = 1; i <= 12; i++) {
            bankDeposit = (bankDeposit + savings) + ((bankDeposit + savings) * 0.12f);
            System.out.println("Месяц: " + i + ", накоплений: " + bankDeposit);
        }
    }

    public static void task10() {
        System.out.println("task10");
        int digit = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(digit + "*" + i + "=" + (digit * i));
        }
    }
}