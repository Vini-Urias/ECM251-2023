import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i = 1;
        int soma = 0;
        do{
            System.out.println("Digite um numero:");
            i = sc.nextInt();
            if(i>100 && i<200){
                soma = soma + 1;
            }
        }while(i!=0);
    System.out.println(soma+" numeros entre 100 e 200 foram digitados");
    sc.close();
    }   
}
