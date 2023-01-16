import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, numberCounter = 0, total=0;

        System.out.print("Sayıyı giriniz :");
        a = input.nextInt();

        while(a != 0){
            total += (a%10);
            a /= 10;
        }
        System.out.println(total);
    }
}