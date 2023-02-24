package Homeworks.Homework_1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Homework_1 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int len =getNumberByUser("Введите колличество элементов последовательности треугольных чисел");
        int[] items = createArray(len);
        System.out.println(print(items));
    }
    //Ввод числа и создание массива
    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    
}
