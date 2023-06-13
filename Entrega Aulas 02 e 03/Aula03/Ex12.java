package Aula03;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Data: ");
        d = sc.nextInt();
        int i=0;
        
        String data = Integer.toString(d);
        char c[] = data.toCharArray();
        
        while(i<=1){
            System.out.print(c[i]);
            i++;
        }
           System.out.print("/");
        while(i>1 && i<=3){
            System.out.print(c[i]);
            i++;
        }
        System.out.print("/");
        while(i>3 && i<=5){
            System.out.print(c[i]);
            i++;
        }
    sc.close();
    }
}
