package Homework_2;
import java.io.File;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;;

/**
 * Homework_2
 */
public class Homework_task_2 {
    public static void main(String[] args) {
        String[] numbers = new String[2];
        readFile(numbers);
        int a = (Integer) numbers[2];
        int b = (Integer) numbers[1];
        Double res = getResult(a, b);
        createFile(res);



    }
    public static void createFile(Double resalt) throws FileNotFoundException {
        try {
            File file = new File("output.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println((String) resalt);
            pw.close();
        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * @param array
     */
    public static void readFile(String[] array) throws FileNotFoundException {
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("input.txt"));
            int index = 0;
            String line;
            while((line = br.readLine()) != null) {
                String[] num = line.split(" ");
                System.out.println(num);
                array[index] = num[1];
                    index++;
            }        
        } catch(IOException e) {
                System.out.println("Error: " + e);
        }
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
