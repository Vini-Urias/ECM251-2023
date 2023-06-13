package Aula04;
import java.util.Scanner;


public class Ex18{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a: ");
        a = sc.nextInt();
        System.out.println("Numero b: ");
        b = sc.nextInt();
        if(a<b){
            System.out.println(" "+a);
            System.out.println(" "+b);
        }
        else{
            System.out.println(" "+b);
            System.out.println(" "+a);
        }
        sc.close();
    }
}
