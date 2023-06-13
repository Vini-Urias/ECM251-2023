import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double inferior, superior;
        int incremento;
        System.out.print("Digite o valor do limite inferior: ");
        inferior = sc.nextDouble();
        System.out.print("Digite o valor do limite superior: ");
        superior = sc.nextDouble();
        System.out.print("Digite o valor do incremento: ");
        incremento = sc.nextInt();
        Double f;
        Double i = inferior;
        System.out.println("Celsius              Fahrenheit");
        while(i<=superior){
            f = (i*1.8) + 32;
            System.out.println("\n"+i+"                      "+f); 
            i = i+incremento;
        }
        sc.close();

    }
}
