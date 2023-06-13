import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idade = new int[1000];
        int j = 0;
        int soma21 = 0;
        int soma50 = 0;
        do{
            System.out.println("Digite sua idade: ");
            idade[j] = sc.nextInt();
            j++;
        }while(idade[j-1]>=0 && idade[j-1]<=120);
        for(int i=0; i<j-1; i++){
            if(idade[i]<21){
                soma21++;
            }
            else if(idade[i]>50){
                soma50++;
            }
        }
        System.out.println(soma21+" pessoas com menos de 21 anos.");
        System.out.println(soma50+" pessoas com mais de 50 anos.");
        sc.close();
    }
    
}
