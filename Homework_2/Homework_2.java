package Homeworks.Homework_2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Homework_2
 */
public class Homework_2 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        String pathFile = "X:" + sep + "GeekBrains" + sep + "Java" + sep + "Homeworks" + sep + "Homework_2" + separetor + "input.txt";
        File file = new File(pathFile);
        System.out.println(file);
        Scanner scanner = new Scanner(file);
        while(scaner.nextLine()) {
            System.out.println(scaner.nextLine());
        }
    }
}
    // public static Integer getNumber(String path) {
    //     int a = 2;
    //     int b = -2;
    //     return a, b;
    // }

//     public static String view(int a, int b) {
//         String result = "";
//         if (a == 0 || b == 0) {
//             result += "a = " + a + ", b = " + b + ", ответ: не определено";
//         }
//         else if (b == 0) {
//             result += "a = " + a + ", b = " + b + ", ответ: 1";
//         } 
//         else {
//             double res = getResult(a, b);
//             result += "a = " + a + ", b = " + b + ", ответ: " + res;
//         }
//         return result;
//     }

//     public static Double getResult(int a, int b) {
//         double res = 1.0;
//         if (b > 0) {
//             for (int i = 0; i < b; i++) {
//                 res *= a;
//             }
//         }
//         else if (b < 0) {
//             while (b < 0) {
//                 res *= 1.0 / a;
//                 b++; 
//             }
//         }
//         return res;
//     }

// }
