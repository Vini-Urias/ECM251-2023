import java.util.Scanner;


    public class Ex5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Double i = 1.1;
            int j = 0;
            Double[] a = new Double[100];
            while( i != -999){
                System.out.println("Digite um numero: ");
                i = sc.nextDouble();
                a[j] = i;
                j++;
            }
            int cont = 0;
        
            while(cont<j-1){
                System.out.println(a[cont]+": \nRaiz Quadrada: "+Math.sqrt(a[cont])+"\nInverso: "+1/a[cont]);
                cont++;
            }
            sc.close();
        }
    }

