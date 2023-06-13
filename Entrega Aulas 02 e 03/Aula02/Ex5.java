/* Ola professor, meus arquivos não rodam pelo prompt do GitBash,
 * mas no terminal do VsCode ta rodando certinho.
 */


package Aula02;
import java.util.Scanner;

public class Ex5{
    public static void main(String args[]) {
        double peso;
        double altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Seus dados digitados foram: \n"+peso+"kg\n"+altura+"m");
        sc.close();
    }

}
