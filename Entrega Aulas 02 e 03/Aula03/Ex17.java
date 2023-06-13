package Aula03;
import java.util.Scanner;


public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Numero: ");
        num = sc.nextInt();
        System.out.println(num);
        System.out.println(Math.pow(num,2));
        System.out.println(Math.sqrt(num));
        sc.close();
    }    
}
