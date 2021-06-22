import java.util.Scanner;
import java.util.Locale;
public class main {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, pi, area, pot;
        System.out.println("Digite o raio do circulo");
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * (pot = Math.pow(raio,2));
        System.out.printf("A area do circulo é, %.4f%n", area);
        sc.close();

    }
}
