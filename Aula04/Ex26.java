package Aula04;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a,b,c;
        System.out.println("Lado a: ");
        a = sc.nextDouble();
        System.out.println("Lado b: ");
        b = sc.nextDouble();
        System.out.println("Lado c: ");
        c = sc.nextDouble();
        if (a == b && b == c) {
            System.out.println("Este é um triângulo equilátero.");
        } 
        else {
            if (a == b || a == c || b == c) {
                System.out.println("Este é um triângulo isósceles.");
            } 
            else {
                System.out.println("Este é um triângulo escaleno.");
            }
        }
        
    sc.close();    
    }
}
