import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        Double preco;
        Double total = 0.0;
        do{
            System.out.println("Digite o preco da mercadoria:");
            preco = sc.nextDouble();
            System.out.println("Digite a quantidade comprada: ");
            quantidade = sc.nextInt();
            if(quantidade<0){
                while(quantidade<0){
                    System.out.println("Digite a quantidade comprada de novo: ");
                    quantidade = sc.nextInt();
                }
            }
            if(preco<0){
                while(preco<0){
                    System.out.println("Digite o preco da mercadoria de novo:");
                    preco = sc.nextDouble();
                }
            }
            total = total + quantidade*preco;
        }while(quantidade!=0);
        System.out.println("Total a ser pago R$"+total);
        sc.close();
    }
}
