package Aula04;
import java.util.Scanner;


public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Numero: ");
        num = sc.nextInt();
        if(num%10 == 0 && num%5 == 0 && num%2 == 0){
            System.out.println("É divisel por 2, por 10 e por 5.");
        }
        else {
            System.out.println("Não é.");
        }
        sc.close();
    }
}
