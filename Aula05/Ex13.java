import java.util.Scanner;


public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma;
        int contador = 0;
        do{
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            soma = 0;
            for(int j=1;j<=numero;j++){
                if(numero%j == 0){
                        soma = soma + j;
                }
            }
            if(soma == (numero+1)){
                contador++;
            }
        }while(numero>0);
        System.out.println(contador+" numeros primos foram digitados.");
        sc.close();
    }
}
