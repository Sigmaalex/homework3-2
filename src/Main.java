import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner s = new Scanner(System.in);
        int clientOs = s.nextInt();
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner s = new Scanner(System.in);
        int clientOs = s.nextInt();
        int year = s.nextInt();
        if (year <= 2015)
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                if (clientOs == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientOs == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
    }
}