package Aula03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        p1 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p2 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p3 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p4 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p5 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p6 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p7 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p8 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p9 = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        p10 = sc.nextLine();
        String total = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10;
        char c[] = total.toCharArray();

        for(int i = c.length; i>0; i--){
            System.out.print(c[i-1]);
        }
        
        sc.close();
    }
}
