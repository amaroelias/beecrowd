import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vendedor = sc.nextLine();
        double salario = sc.nextDouble(), valorVendas = sc.nextDouble();
        double bonusSalario = valorVendas * 0.15;
        salario += bonusSalario;
        System.out.println("TOTAL = R$ " + String.format("%.2f",salario));
    }
}
