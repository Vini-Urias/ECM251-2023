package Aula03;
import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
    Double n1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    n1 = sc.nextDouble();
    Double resultado = Math.pow(n1,2);
    System.out.println(n1+" ao quadrado eh:"+resultado);
    sc.close();
    }
}
