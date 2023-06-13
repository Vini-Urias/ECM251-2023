package Aula04;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        String nome, sexo, f, F;
        f = "feminino";
        F = "Feminino";
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Sexo: ");
        sexo = sc.nextLine();
        System.out.println("Idade: ");
        idade = sc.nextInt();
        if(idade<25 && (sexo.equals(f) || sexo.equals(F)) ){
            System.out.println(nome+" ACEITA");
        }   
        else{
            System.out.println(nome+" NAO ACEITA");
        }
        sc.close();
    }
}
