package Aula03;
import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        Double num, base;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextDouble();
        System.out.println("Digite a base do log: ");
        base = sc.nextDouble();
        System.out.println("Log de "+num+" na base "+base+": "+Math.log(num)/Math.log(base));
        sc.close();
    }
    
}
