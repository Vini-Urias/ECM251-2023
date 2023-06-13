import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int fatorial = 1;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        for(int i = numero;i>0; i--){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de "+numero+" é igual a "+fatorial);
        sc.close();
    }
}
