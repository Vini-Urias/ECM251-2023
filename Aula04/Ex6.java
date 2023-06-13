package Aula04;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Double num = sc.nextDouble();
        if(num>20){
            System.out.println("O numero "+num+" eh maior que 20.");
        }
        else{
            if(num<20){
                System.out.println("O numero "+num+" eh menor que 20.");
            }
            else{
                System.out.println("O numero digitado eh 20");
            }
            
        }
        sc.close();
    }
}
