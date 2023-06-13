package Aula03;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        a = sc.nextDouble();

        System.out.println("Digite um numero: ");
        b = sc.nextDouble();

        System.out.println("Digite um numero: ");
        c = sc.nextDouble();

        Double x = 2 * ((a-c)/8)-(b*5);
        System.out.println(x);
        sc.close();
    }    
}
