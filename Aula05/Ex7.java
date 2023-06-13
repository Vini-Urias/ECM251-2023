import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto = 1;
        for(int i = 120;i<=300; i++){
           produto = produto * i;
           System.out.println(produto);
        }
        
        sc.close();
    }
}
