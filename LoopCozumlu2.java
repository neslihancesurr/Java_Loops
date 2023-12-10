package Java3;
// Fibonacci sayılarını ekranda gösterme
import java.util.Scanner;

public class LoopCozumlu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 1;
        int sum = 0;

        System.out.print("How many Fibonacci numbers would you like to list?");
        int N = input.nextInt();

        System.out.println(number2);

        for(int i = 1; i <= N; i++){
            sum = number1 + number2;
            System.out.println(sum);

            number1 = number2;
            number2 = sum;
        }

// number1 number2 sum
// 0 1 1 2 3 5 8
    }
}


