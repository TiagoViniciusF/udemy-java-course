import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       int num1, num2, soma1;
       System.out.printf("digite um numero inteiro %n");
       num1 = sc.nextInt();
       System.out.printf("digite outro numero inteiro %n");
       num2 = sc.nextInt();
       soma1 = num1 + num2;
       System.out.println("a soma deles é " + soma1);
sc.close();
    }
}
