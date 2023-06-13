package Aula04;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        int a,b,c, maior;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a: ");
        a = sc.nextInt();
        System.out.println("Numero b: ");
        b = sc.nextInt();
        System.out.println("Numero c: ");
        c = sc.nextInt();

        if(a>b && a>c){
            maior = a;
        }
        else{
            if (b>a && b>c){
                maior = b;
            }
            else {
                maior = c;
            }
        }
        sc.close();
    }
}
