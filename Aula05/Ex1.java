import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = 0;
        System.out.println(j);
        j++;
        while(i<20){
            if(j%2 == 0){
                System.out.println(j);
                i++;
                j++;
            }
            else {
                j++;
            }

        }
    sc.close();
    }
}