import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] codigo = new int[1000];
        Double[] quantidade_KWh = new Double[1000];
        int[] tipo = new int[1000];
        codigo[0] = 1;
        int j = 0;
        Double soma1 = 0.0;
        Double soma2 = 0.0;
        Double soma3 = 0.0;
        /*
        * 1 - residencial, preço por kWh = R$ 0,3; 
        * 2 - comercial, preço por kWh = 0,5; 
        * 3 -industrial, preço por kWh = 0,7
         */
        do{
            System.out.print("\nDigite seu codigo de consumidor: ");
            codigo[j] = sc.nextInt();
            System.out.print("\nDigite o tipo de consumidor: ");
            tipo[j] = sc.nextInt();
            System.out.print("\nDigite a quantidade de consumo desse mes: ");
            quantidade_KWh[j] = sc.nextDouble();
            j++;
        }while(codigo[j-1] != 0);

        for(int i = 0; i<j-1; i++){
            if(tipo[i] == 1){
                soma1 = soma1 + quantidade_KWh[i]*0.3;
                System.out.println("\nCódigo: "+codigo[i]+"\nTipo: "+tipo[i]+"\nCusto total: R$"+quantidade_KWh[i]*0.3+"\n");
                
            }
            else if(tipo[i] == 2){
                soma2 = soma2 + quantidade_KWh[i]*0.5;
                System.out.println("\nCódigo: "+codigo[i]+"\nTipo: "+tipo[i]+"\nCusto total: R$"+quantidade_KWh[i]*0.5+"\n");
            }
            else if(tipo[i] == 3){
                soma3 = soma3 + quantidade_KWh[i]*0.7;
                System.out.println("\nCódigo: "+codigo[i]+"\nTipo: "+tipo[i]+"\nCusto total: R$"+quantidade_KWh[i]*0.7+"\n");
            }
            else{
                System.out.println("Tipo de consumidor nao aceito.");
            }
        }
        System.out.println("\n  Custo total consumidores tipo 1: R$"+soma1+"\n");
        System.out.println("\n  Custo total consumidores tipo 2: R$"+soma2+"\n");
        System.out.println("\n  Custo total consumidores tipo 3: R$"+soma3+"\n");
        int contador = 0;
        for(int i = 0;i<j-1;i++){
            if(tipo[i] == 1 || tipo[i] == 2){
                contador = contador + 1;
            }
        }
        System.out.println("\nMedia entre os consumidores do tipo 1 e 2: "+(soma1+soma2)/contador+" kWh");
        sc.close();
    }
}
