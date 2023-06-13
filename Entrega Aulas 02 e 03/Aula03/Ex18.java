package Aula03;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int b, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do triangulo: ");
        h = sc.nextInt();
        System.out.println("Digite a base do tringulo: ");
        b = sc.nextInt();

        System.out.println("A area é: "+(b*h)/2);
        sc.close();
    }
    
}
