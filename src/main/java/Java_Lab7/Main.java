package Java_Lab7;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PerfectNumberFinder finder = new PerfectNumberFinder();

        System.out.println("--- Пошук Досконалих Чисел ---");
        System.out.print("Введіть верхню межу (n), до якої шукати (напр., 10000): ");

        try {
            int limit = Integer.parseInt(scanner.nextLine());

            if (limit <= 0) {
                throw new NumberFormatException("Число має бути додатним.");
            }

            List<Integer> perfectNumbers = finder.findInRange(limit);

            if (perfectNumbers.isEmpty()) {
                System.out.println("В діапазоні від 1 до " + limit + " досконалих чисел не знайдено.");
            } else {
                System.out.println("Знайдені досконалі числа: " + perfectNumbers);
            }

        } catch (NumberFormatException e) {
            System.err.println("ПОМИЛКА: Введено некоректне число. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
