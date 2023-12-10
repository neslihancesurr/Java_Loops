package Java3;

import java.util.Scanner;

//Kullanıcıdan bir doğal sayı okuyan ve bu doğal sayının tüm basamaklarının
//toplamını ekranda gösteren programı yazınız. Örneğin kullanıcınını girdiği
//sayı 58932 ise, basamaklarının toplamı 5 + 8 + 9 + 3 + 2= 27’dir.
public class LoopCozumsuz2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int basamak;
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number > 0){
            basamak = number % 10;
            sum += basamak;
            number = number/10;

        }
        System.out.println("Sum of digits: " + sum);
    }
}
