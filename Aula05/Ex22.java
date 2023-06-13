import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        int i = 1;
        int j = 1;
        while(i<=numero){
            do{
                if(j%2==0){
                    System.out.println("    "+j);
                }
                j++;
            }while(j%2==0);
            i++;
        }
        sc.close();
    }
}
