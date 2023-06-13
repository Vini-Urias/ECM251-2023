import java.util.Scanner;

public class Ex15{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, primeiro = 0, segundo = 1, proximo=0;
        System.out.print("Digite um número: ");
        num = sc.nextInt();
        System.out.print("Sequência de Fibonacci de 1 até " + num + ": ");
        while(proximo <=num){
            System.out.print(primeiro + " ");
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        sc.close();
    }
}
