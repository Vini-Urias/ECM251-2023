package Aula04;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a: ");
        a = sc.nextInt();
        System.out.println("Numero b: ");
        b = sc.nextInt();
        System.out.println("Numero c: ");
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(" "+a);
        }
        else{
            if (b>a && b>c){
                System.out.println(" "+b);
            }
            else {
                System.out.println(" "+c);
            }
            
        }
        sc.close();
    }
}
