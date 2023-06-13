import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=500; i++){
            if(i%5 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
