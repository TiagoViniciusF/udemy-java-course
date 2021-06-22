import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,dif;
        System.out.println("Digite 4 numeros inteiros");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        dif = a*b - c*d;
        System.out.println("A diferenca entre os numeros digitados é " + dif);
        sc.close();
    }
}