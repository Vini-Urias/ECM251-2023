package Aula03;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        String frase1, frase2, frase3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira frase: ");
        frase1 = sc.nextLine();
        char c1[] = frase1.toCharArray();

        System.out.println("Digite a segunda frase: ");
        frase2 = sc.nextLine();
        char c2[] = frase2.toCharArray();

        System.out.println("Digite a terceira frase: ");
        frase3 = sc.nextLine();
        char c3[] = frase3.toCharArray();


        int metade1 = (c1.length/2) - 1; //-1 pra metade ficar na metade exata do array
        int metade2 = (c2.length/2) - 1;
        int metade3 = (c3.length/2) - 1;
        
        System.out.println(frase1+frase2+frase3+"\n");
        for(int i=0;i<=metade2;i++){
            System.out.print(c2[i]);
        }
        for(int j=metade3+1;j<c3.length;j++){
            System.out.print(c3[j]);
        }
        for(int j=metade2+1;j<c2.length;j++){
            System.out.print(c2[j]);
        }  
        for(int i=0;i<=metade1;i++){
            System.out.print(c1[i]);
        }
        for(int i=0;i<=metade3;i++){
            System.out.print(c3[i]);
        }
        for(int j=metade1+1;j<c1.length;j++){
            System.out.print(c1[j]);
        } 

        sc.close();
    }
    
}
