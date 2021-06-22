import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numFunc;
        Double horasTrab, valHora, salario;
        System.out.println("Digite o numero do funcionario");
        numFunc = sc.nextInt();
        System.out.println("Digite o numero de horas trabalahadas neste Mês");
        horasTrab = sc.nextDouble();
        System.out.println("Informe o valor da hora trabalhada");
        valHora = sc.nextDouble();
        salario = horasTrab*valHora;
            System.out.println("Funcionario nº " +  numFunc);
            System.out.printf("Salario = U$ %.2f", salario);
        sc.close();
    }
}