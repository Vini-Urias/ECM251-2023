import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Polegadas              Centimetros");
        for(int i = 1; i<=20; i++){
            System.out.println("\n"+i+"                      "+i*2.54);
        }
        sc.close();
    }
}
