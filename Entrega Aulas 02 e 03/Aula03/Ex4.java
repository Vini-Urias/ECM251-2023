package Aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String p1, p2, p3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        p1 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p2 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p3 = sc.nextLine();
        int tam_p1, tam_p2, tam_p3;
        tam_p1 = p1.length();
        tam_p2 = p2.length();
        tam_p3 = p3.length();
        int total = tam_p1 + tam_p2 + tam_p3;
        System.out.println(total);

        sc.close();
    }
}
