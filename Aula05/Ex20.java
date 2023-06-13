import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[20];
        String[] sexo = new String[20];
        int[] idade = new int[20];
        String masculino = "Masculino";
        for(int i = 0; i<20; i++){
            System.out.print("Digite seu nome: ");
            nome[i] = sc.next();
            System.out.print("Digite seu sexo: ");
            sexo[i] = sc.nextLine();
            System.out.print("Digite sua idade: ");
            idade[i] = sc.nextInt();
        }
        for(int i=0; i<20;i++){
            if(sexo[i].equals(masculino) && idade[i]>21){
                System.out.println("\n      "+nome[i]);
            }
        }
        sc.close();
    }
}
