package Aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        String palavra1;
        String palavra2;
        String palavra3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira palavra: ");
        palavra1 = sc.nextLine();
        System.out.println("Digite a segunda palavra: ");
        palavra2 = sc.nextLine();
        System.out.println("Digite a terceira palavra: ");
        palavra3 = sc.nextLine();
        System.out.println(palavra3+" "+palavra2+" "+palavra1);
        sc.close();
    }
}
