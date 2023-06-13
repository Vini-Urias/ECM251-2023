package Aula02;
import java.util.Scanner;

public class Ex7 {
    public static void main(String args[]) {
        char milhar, centena, dezena, unidade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digito do milhar: ");
        milhar = sc.next(). charAt(0);
        System.out.println("Digito do centena: ");
        centena = sc.next(). charAt(0);
        System.out.println("Digito do dezena: ");
        dezena = sc.next(). charAt(0);
        System.out.println("Digito do unidade: ");
        unidade = sc.next(). charAt(0);
        System.out.println(milhar+""+centena+""+dezena+""+unidade);
        sc.close();
    }
}
