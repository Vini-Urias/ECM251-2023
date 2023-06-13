package Aula04;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("1º: ");
        a = sc.nextInt();
        System.out.println("2º: ");
        b = sc.nextInt();
        int soma = a + b;
        if(soma>10){
            System.out.println(soma);
        }
    sc.close();
    }
}
