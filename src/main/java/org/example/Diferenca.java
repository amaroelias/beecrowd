import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(),c = sc.nextInt(), d = sc.nextInt();
        int prod  = (a * b) - (c * d);
        System.out.println("DIFERENCA = " + prod);
    }
}
