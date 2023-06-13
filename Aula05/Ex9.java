import java.util.Scanner;


public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int i = 0;
            
            while( i != -999){
                System.out.println("Digite um numero: ");
                i = sc.nextInt();
                for(int j=1;j<=i;j++){
                    if(i%j == 0){
                        System.out.println("      Dividendo de "+i+":\n      "+j);
                    }
                }
            }
            sc.close();
    }
}
