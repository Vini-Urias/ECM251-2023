package Aula03;
import java.util.Scanner;
/*
 * Resultado ta dando errado mas a formula ta igual ao do slide
 * 
 * 
 */


public class Ex6 {
    public static void main(String[] args) {
        Double divida_inicial, divida_final, juros;
        int meses;
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da Divida: ");
        divida_inicial = sc.nextDouble();
        System.out.print("Numero de meses para calculo: ");
        meses = sc.nextInt();
        System.out.print("Valor do juros em porcentagem: ");
        juros = sc.nextDouble();
        divida_final = divida_inicial*Math.pow((1+juros)/100,meses);
        System.out.println("Divida final: "+divida_final);

        sc.close();
    }
}
