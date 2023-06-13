package Aula04;
import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Double salario, prestacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Salario: ");
        salario = sc.nextDouble();
        System.out.println("Prestacao: ");
        prestacao = sc.nextDouble();
        if(prestacao<=salario*0.3){
            System.out.println("O emprestimo pode ser concedido.");
        }
        else {
            System.out.println("O emprestimo nao pode ser concendido.");
        }
        sc.close();
    }
}
