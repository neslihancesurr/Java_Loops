package Java3;
// Read N from the user and make program that calculates 1/1 + 1/2 + 1/3 + .... + 1/N
import java.util.Scanner;

public class LoopCozumlu1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;
        double sum = 0;

        System.out.println("Enter an integer.");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            sum += (double) 1/i;
        }

        System.out.println(sum);

    }
}
