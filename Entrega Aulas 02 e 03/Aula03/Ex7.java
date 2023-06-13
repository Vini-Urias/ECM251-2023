package Aula03;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        String numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = sc.nextLine();
        char c[] = numero.toCharArray();
        System.out.println(c[3]); 
        sc.close();
    }
}
