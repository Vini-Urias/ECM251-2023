import java.util.Scanner;


public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for(int i = 1;i<=100; i++){
           soma = soma + i;
           System.out.println(i);
        }
        System.out.println(soma);



        sc.close();
    }
    
}
