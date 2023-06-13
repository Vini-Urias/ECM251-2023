package Aula04;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,maior,intermediario,menor;
        System.out.println("Numero a: ");
        a = sc.nextInt();
        System.out.println("Numero b: ");
        b = sc.nextInt();
        System.out.println("Numero c: ");
        c = sc.nextInt();
        if(a>b && a>c){
            maior = a;
            if(b>c){
                intermediario = b;
                menor = c;
            }
            else{
                intermediario = c;
                menor = b;
            }
        }
        else {
            if(b>a && b>c){
                maior = b;
                if(a>c){
                    intermediario = a;
                    menor = c;
                }
                else {
                    intermediario = c;
                    menor = a;
                }
            }
            else {
                maior = c;
                if(a>b){
                    intermediario = a;
                    menor = b;
                }
                else {
                    intermediario = b;
                    menor = a;
                }
            }
        }
        System.out.println("Maior: "+maior+"\nIntermediario: "+intermediario+"\nMenor: "+menor);
        sc.close();
    }
}
