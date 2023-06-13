package Aula03;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int b, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        a = sc.nextInt();

        System.out.print("Digite um numero: ");
        b = sc.nextInt();
        
        System.out.println("Dividendo: "+a);
        System.out.println("Divisor: "+b);
        System.out.println("Quociente: "+a/b);
        System.out.println("Resto: "+a%b);
        sc.close();
    }
}
