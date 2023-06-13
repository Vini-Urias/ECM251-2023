package Aula03;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        String data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Data: ");
        data = sc.nextLine();
        char c[] = data.toCharArray();
        int i=0;
        while(i<=1){
            System.out.print(c[i]);
            i++;
        }
        i++;
        System.out.print(" ");
        while(i>2 && i<=4){
            System.out.print(c[i]);
            i++;
        }
        i++;
        System.out.print(" ");
        while(i>4 && i<=7){
            System.out.print(c[i]);
            i++;
        }
    sc.close();
    }
}
