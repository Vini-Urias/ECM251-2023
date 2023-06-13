package Aula04;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a: ");
        a = sc.nextInt();
        System.out.println("Numero b: ");
        b = sc.nextInt();
        if(a<b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }



        sc.close();
    }
}
