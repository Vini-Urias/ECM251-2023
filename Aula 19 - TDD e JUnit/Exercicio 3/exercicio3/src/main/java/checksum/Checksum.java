package checksum;
import java.util.Scanner;

public class Checksum {
    Scanner sc = new Scanner(System.in);
    private int soma = 0;
    char add;

    public Checksum(){

    }

    public char[] stringToChar(String msg){
        char[] msgChar = msg.toCharArray();
        return msgChar;
    }

    public String getMensagem(){
        System.out.println("Digite a mensagem");
        return sc.nextLine();
    }

    public String Complemento2(){
        String msg = "Casa1";
        char[] msgChar = stringToChar(msg);

        for(int i=0;i<msgChar.length;i++){
            int valor = (int) msgChar[i];
            soma = soma + valor;
        }
        soma = soma-256;
        soma = 255-soma;
        soma = soma+1;
        char add = (char) soma;
        return msg+=add;
    }
}