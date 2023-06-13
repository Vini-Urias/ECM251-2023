import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, voto;
        Double  votantes = 0.0;
        do{
            System.out.println("Digite seu voto: ");
            voto = sc.nextInt();
            if(voto == 1){
                c1++;
            }
            else if(voto == 2){
                c2++;
            }
            else if(voto == 3){
                c3++;
            }
            else if(voto == 4){
                c4++;
            }
            votantes = votantes + 1; // Aqui considera quem nao votou em nenhum dos 4 candidatos, mas nao pontua pra nenhum deles.
        }while(voto!= -1);
    
        DecimalFormat formato = new DecimalFormat("#.##");
        
        System.out.println("O candidato 1 teve "+formato.format(c1*100/votantes)+"% dos votos");

        System.out.println("O candidato 2 teve "+formato.format(c2*100/votantes)+"% dos votos");

        System.out.println("O candidato 3 teve "+formato.format(c3*100/votantes)+"% dos votos");

        System.out.println("O candidato 4 teve "+formato.format(c4*100/votantes)+"% dos votos");

        System.out.println("Essa votação teve "+votantes+" votantes.");
    
    
    
    }
}
