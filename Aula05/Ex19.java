import java.util.Scanner;


public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double superior;
        int incremento;
        
        System.out.print("Digite o valor do limite superior: ");
        superior = sc.nextDouble();
        System.out.print("Digite o valor do incremento: ");
        incremento = sc.nextInt();
        for(int i = 0; i<=superior; i = i +incremento){
            System.out.println(i);
        }

        sc.close();
    }
}
