package Aula03;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Double raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        Double area = Math.PI*raio*raio;
        System.out.printf("Area: %.2f",area);
        sc.close();
    }
}
