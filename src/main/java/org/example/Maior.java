import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int maior = Math.max(Math.max(a, b), c);
        System.out.println(maior+" eh o maior");
    }
}
