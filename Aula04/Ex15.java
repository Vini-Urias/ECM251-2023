package Aula04;
import java.util.Scanner;
import java.util.Calendar;

public class Ex15 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int ano_atual = c.get(Calendar.YEAR);
        int ano_nascimento;
        String aniversario, sim, Sim;
        sim = "sim";
        Sim = "Sim";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ja fez aniversario esse ano?");
        aniversario = sc.nextLine();
        System.out.println("Ano de nascimento: ");
        ano_nascimento = sc.nextInt();
        
        
        if(aniversario.equals(sim) || aniversario.equals(Sim)){
            if(ano_nascimento<=ano_atual){
                System.out.println((ano_atual-ano_nascimento)+" anos");
            }
            else {
                System.out.println("Ano de nascimento nao é valido.");
            }
        }
        else{
            if(ano_nascimento<=ano_atual){
                System.out.println((ano_atual-ano_nascimento-1)+" anos");
            }
            else {
                System.out.println("Ano de nascimento nao é valido.");
            }
        }
        sc.close();
    }
}
