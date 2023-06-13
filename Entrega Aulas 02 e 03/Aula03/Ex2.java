package Aula03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        double base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();
        Double area = base * altura;
        System.out.println(area);
        sc.close();


    }
}
