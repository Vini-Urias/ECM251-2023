package Aula04;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite um numero: ");
        a = sc.nextInt();

        System.out.println("Digite um numero: ");
        b = sc.nextInt();

        System.out.println("Digite um numero: ");
        c = sc.nextInt();

        if(a<b && a<c){
            System.out.println(a);
            if(b<c){
                System.out.println(b);
                System.out.println(c);
           }
           else{
            System.out.println(c);
            System.out.println(b);
           }
        }
        else {
            if(b<a && b<c){
                System.out.println(b);
                if(a<c){
                    System.out.println(a);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(a);
                }
            }
            if(c<a && c<b){
                System.out.println(c);
                if(a<b){
                    System.out.println(a);
                    System.out.println(b);
                }
                else {
                    System.out.println(b);
                    System.out.println(a);
                }
            }
        }
        sc.close();
    }
}
