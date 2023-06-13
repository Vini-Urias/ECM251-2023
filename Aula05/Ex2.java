import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = 0;
        int[] a = new int[100];
        while( i != 0){
            System.out.println("Digite um numero positivo: ");
            a[j] = sc.nextInt();
            System.out.println("Se quiser parar de digitar numeros, digite zero (0)");
            i = sc.nextInt();
            j++;
        }
        int cont = 0;
        int soma = 0;
        while(cont<j){
            soma = soma +a[cont];
            cont++;
        }
        System.out.println("Soma: "+soma+"\nTotal de numeros: "+j+"\nMedia:"+soma/j);
        sc.close();
    }
}
