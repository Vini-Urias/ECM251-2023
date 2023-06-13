package Aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String args[]) {
        int dia;
        int mes;
        int ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        dia = sc.nextInt();
        System.out.println("Digite o mes: ");
        mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        ano = sc.nextInt();
        System.out.println(dia+"/"+mes+"/"+ano);
        sc.close();
    }
}
