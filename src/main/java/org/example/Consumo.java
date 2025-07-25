import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double gaso = sc.nextDouble();
        double gasto = km / gaso;
        System.out.println(String.format("%.3f",gasto)+" km/l");
    }
}
