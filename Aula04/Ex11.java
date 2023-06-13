package Aula04;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Numero: ");
        num = sc.nextInt();
        if(num%3 == 0 && num%7 == 0){
            System.out.println("É divisel por 3 e por 7.");
        }
        else {
            System.out.println("Não é.");
        }
        sc.close();
    }
}
