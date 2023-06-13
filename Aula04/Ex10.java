package Aula04;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Numero: ");
        num = sc.nextInt();
        if(num%5 == 0){
            System.out.println("É divisel por 5.");
        }
        else {
            System.out.println("Não é.");
        }
        sc.close();
    }
}
