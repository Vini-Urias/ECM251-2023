package Aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String args[]) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        System.out.println("O valor do numero digitado eh: "+numero);
        sc.close();
    }
}
