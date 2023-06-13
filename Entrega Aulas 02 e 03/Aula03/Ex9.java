package Aula03;
import java.util.Scanner;



public class Ex9 {
    public static void main(String[] args) {
        Double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextDouble();
        System.out.println(Math.log10(num));
        sc.close();
    }    
}
