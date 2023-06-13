import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String[] a = new String[100];
        String i = "a";
        String teste = "Fim";
        int j= 0;
        int cont = 0;
        while(i.equals(teste) == false){
            System.out.print("Digite um nome: ");
            i = sc.nextLine();
            a[j] = i;
            j++;
        }
        while(cont<j-1){
            System.out.println(a[cont]);
            cont++;
        }
    sc.close();
    }   
}
