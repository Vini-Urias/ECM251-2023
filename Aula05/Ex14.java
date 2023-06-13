import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[1000];
        int maior = 0;
        int i =0 ;
        do{
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if(i!=0){
                if(numeros[i]<numeros[i-1]){
                    maior = numeros[i-1];
                }
                else{
                    maior = numeros[i];
                }
            }
            i++;
        }while(numeros[i-1]!= -999);
        System.out.println("O maior numero é "+maior);
        sc.close();
    }
}
