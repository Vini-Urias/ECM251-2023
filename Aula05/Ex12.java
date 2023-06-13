import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        for(int j=1;j<=numero;j++){
            if(numero%j == 0){
                    soma = soma + j;
            }
        }
        if(soma == (numero+1)){
            System.out.println("O numero é primo.");
        }
        else{
            System.out.println("O numero nao é primo.");
        }
        sc.close();
    }
}
