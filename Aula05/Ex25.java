import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1, num2;
        int opcao;
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextDouble();
        do{
            System.out.println("Operações Disponíveis:\n1. Adição;\n2. Subtração;\n3. Multiplicação;\n4. Divisão;\n9. Sair do Programa.\nDigite o número de ordem da opção desejada:");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                System.out.println("\nAdição    "+(num1+num2)+"\n");
                break;
                case 2:
                System.out.println("\nSubtração    "+(num1-num2)+"\n");
                break;
                case 3:
                System.out.println("\nMultiplicação    "+(num1*num2)+"\n");
                break;
                case 4:
                if(num2!=0){
                    System.out.println("\nDivisão    "+(num1/num2)+"\n");
                }
                break;
            }
        }while(opcao!=9);

        sc.close();
    }
}
