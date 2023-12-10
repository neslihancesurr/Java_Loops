package Java3;

import java.util.Scanner;

//Kullanıcıdan iki sayı okuyan ve bu iki sayının EKOK’unu (En Küçük Ortak
//Kat) ekranda gösteren programı yazınız.
// Önce iki sayıdan küçüğünü buluruz. N1 küçükse aynı devam N2 küçükse swap them.
// Küçük sayıyı her sayıyla çarmaya başlasak. sonuc eğer ikinci sayıya tam bölünüyorsa looptan çıksak
// 3 25
public class LoopCozumlu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bigger = 0;
        int kat;
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if (number1 == number2){
            System.out.println("Sayılar eşit olamaz.");
        } else if (number2 < number1){ //swapping the variables to make number1 the smaller number
           int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        for (int i = number2; ; i++){
             if (i % number2 == 0 && i % number1 == 0){
                 System.out.println("Sayı 1: " + number1);
                 System.out.println("Sayı 2: " + number2);
                 System.out.println("EKOK: " + i);
                 break;
            }
        }
    }
}
