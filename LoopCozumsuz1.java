package Java3;

import java.util.Scanner;

// Kullanıcıdan bir doğal sayı okuyan ve bu sayının basamaklarını ekranda
//gösteren programı yazınız. Yazdığınız program, kullanıcının girdiği sayının
//basamak sayısını da ekranda göstermelidir.
public class LoopCozumsuz1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;
        int basamak;
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number > 0){
        basamak = number % 10;
        number = number/10;
            System.out.println(basamak);
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
