package Aula04;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a,b,c;
        System.out.println("Lado a: ");
        a = sc.nextDouble();
        System.out.println("Lado b: ");
        b = sc.nextDouble();
        System.out.println("Lado c: ");
        c = sc.nextDouble();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("Podem ser lados de um triangulo");
        }
        else {
            System.out.println("Nao podem ser lados de um triangulo");
        }
    sc.close();    
    }
}
