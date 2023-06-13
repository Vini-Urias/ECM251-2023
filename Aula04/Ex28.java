package Aula04;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int a;
        System.out.print("Digite um nome: ");
        nome = sc.nextLine();
        a = nome.charAt(0);
        if(a>=65 && a<=75){
            System.out.println(nome+" está na divisão D1.");
        }
        else if(a>=76 && a<=78){
            System.out.println(nome+" está na divisão D2.");
        }
        else if(a>=79 && a<=90){
            System.out.println(nome+" está na divisão D3.");
        }
      
        sc.close();
    }
}
