import java.util.Scanner;
public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        Scanner sc = new Scanner(System.in);
        String nota;
        int i;
        int opcao = 0;
        while(opcao!=5){
            System.out.println("\nEscolha as opções a seguir:\n1) Insira uma nota;\n2) Remova uma nota;\n3) Altere uma nota;\n4) Listar todas as notas; e\n5) Saia do sistema.\n");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Qual nota gostaria de adicionar?\n");
                    nota = sc.nextLine();
                    bloco.addNotas(nota);
                    break;

                case 2:
                    System.out.println("Qual nota gostaria de remover?\n");
                    i = sc.nextInt();
                    bloco.removeNotas(i);
                    break;

                case 3:
                    System.out.println("Qual nota gostaria de alterar?\n");
                    i = sc.nextInt();
                    System.out.println("Qual nota gostaria de colocar no lugar?\n");
                    nota = sc.nextLine();
                    bloco.alterarNotas(nota, i);
                    break;

                case 4:
                    bloco.listarNotas();
                    break;
            }
        }
        sc.close();
    }
    

}
