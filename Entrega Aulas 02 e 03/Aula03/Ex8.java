package Aula03;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Double graus;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do angulo: ");
        graus = sc.nextDouble();
        Double radianos = Math.toRadians(graus);

        System.out.println("Seno: "+Math.sin(radianos));
        System.out.println("Cosseno: "+Math.cos(radianos));
        System.out.println("Tangente: "+Math.tan(radianos));
        System.out.println("Secante: "+1/(Math.cos(radianos)));
        System.out.println("Cossecante: "+1/(Math.sin(radianos)));
        System.out.println("Cotangente: "+1/(Math.tan(radianos)));
        sc.close();
    }
}
