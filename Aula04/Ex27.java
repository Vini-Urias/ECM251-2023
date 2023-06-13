package Aula04;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("Digite um verbo: ");
        a = sc.nextLine();
        char c[] = a.toCharArray();
        int tam = c.length;
        if(c[tam-1] == 'r'){
            if(c[tam-2] == 'a'){
                System.out.println("1º conjugacao.");
            }
            else if(c[tam-2] == 'e'){
                System.out.println("2º conjugacao.");
            }
            else if(c[tam-2] == 'i'){
                System.out.println("3º conjugacao.");
            }
            else if(c[tam-2] == 'o' || c[tam-2] == 'u'){
                System.out.println("Nao é verbo no infinitivo.");
            }
        }
        else{
            System.out.println("Nao esta no infinitivo.");
        }







        sc.close();
    }
}
