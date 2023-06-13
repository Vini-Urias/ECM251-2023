package Aula04;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Raiz: "+Math.sqrt(num));
        }
        else {
            System.out.println("Quadrado de "+num+":"+Math.pow(num,2));
        }
        sc.close();
    }
}
