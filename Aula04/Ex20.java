package Aula04;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a: ");
        a = sc.nextInt();
        System.out.println("Numero b: ");
        b = sc.nextInt();
        if(a<b){
            System.out.println(" "+Math.pow(a,2));
            System.out.println(" "+Math.sqrt(b));
        }
        else{
            System.out.println(" "+Math.pow(b,2));
            System.out.println(" "+Math.sqrt(a));
        }
        sc.close();
    }   
}
