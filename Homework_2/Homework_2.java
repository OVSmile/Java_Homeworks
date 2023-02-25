package Homeworks.Homework_2;
import java.util.Scanner;

public class Homework_2 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    int a = getNumberByUser("Введите число а: ");
    int b = getNumberByUser("Введите число (степень) b: ");
    if (a == 0 || b == 0) {
        System.out.printf("a = %d, b = %d, ответ: не определено", a, b);
    }
    else if (b == 0) {
        System.out.printf("a = %d, b = %d, ответ: 1", a, b);
    } 
    else {
        double result = getResult(a, b);
        System.out.printf("a = %d, b = %d, ответ: %f", a, b, result);   
    }
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static Double getResult(int a, int b) {
        double res = 1.0;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                res *= a;
            }
        }
        else if (b < 0) {
            while (b < 0) {
                res *= 1.0 / a;
                b++; 
            }
        }
        return res;
    }

}