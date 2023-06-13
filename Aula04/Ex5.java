package Aula04;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Double num = sc.nextDouble();
        if(num>20 && num<90){
            System.out.println("O numero "+num+" esta entre 20 e 90.");
        }
        else{
            System.out.println("O numero "+num+" nao esta entre 20 e 90.");
        }
        sc.close();
    }
}
