package Aula03;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Double D, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a diagonal maior: ");
        D = sc.nextDouble();
        System.out.println("Digite a diagonal menor: ");
        d = sc.nextDouble();

        System.out.println("A area é: "+(D*d)/2);
        sc.close();
    }
}