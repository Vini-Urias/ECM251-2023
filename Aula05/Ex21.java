import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        for(int i = numero-1; i>0; i--){
            if(i%2!=0){
                System.out.println("    "+i);
            }
        }
        sc.close();
    }
}
