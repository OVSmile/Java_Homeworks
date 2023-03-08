package Homework_1;
import java.util.Scanner;


class  Homework_tast_1 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int len =getNumberByUser("Введите колличество элементов последовательности треугольных чисел: ");
        int[] items = createArray(len);
        fillArray(items);
        System.out.println(print(items));
    }
    //Вво5д числа и создание массива
    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    //вывод на печать
    public static String print(int[] data) {
        String output = "";
       
        for (int i = 0; i < data.length; i++) {
            output += data[i] + " ";
        }
        return output;
    }

    //Заполнение массива (решение)
    public static void fillArray(int[] col) {
        int n = 1;
        for (int i = 0; i < col.length; i++) {
            double resalt = (1.0 / 2 * n * (n + 1));
            col[i] = (int)resalt;
            n++;
            System.out.println(resalt);
        }
    }
}
