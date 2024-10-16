package app;

import java.util.Scanner;

public class ProgramMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        printSquare(num);

        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        System.out.print("Введіть кількість елементів масиву: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = calculateArraySum(array);
        System.out.println("Масив чисел: " + java.util.Arrays.toString(array));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();
        String reversedText = reverseString(text);
        System.out.println("Рядок в зворотньому порядку: " + reversedText);

        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int result = calculatePower(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + result + ".");

        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String textToRepeat = scanner.nextLine();
        printTextMultipleTimes(n, textToRepeat);

        scanner.close();
    }

    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    public static int calculatePower(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}