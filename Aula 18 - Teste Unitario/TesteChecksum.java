public class TesteChecksum {
    public static void main(String[] args) {
        Checksum teste = new Checksum();
        boolean validacao = true;
        int soma = 0;


        String msg = "Teste";
        char[] charTeste = teste.stringToChar(msg);
        char[] charMsg = msg.toCharArray();
        
        for(int i=0;i<charMsg.length;i++){
            if(charTeste[i] == charMsg[i]){
                validacao = true;
            }
            else{
                validacao = false;
            }
        }



        String testeMensagem = teste.getMensagem();
        if(testeMensagem.equals(msg)){
            validacao = true;
        }
        else{
            validacao = false;
        }


        String complemento2 = teste.calcularComplemento2();
        for(int i=0;i<charMsg.length;i++){
            int valor = (int) charMsg[i];
            soma = soma + valor;
        }
        soma = soma-256;
        soma = 255-soma;
        soma = soma+1;
        char add = (char) soma;
        msg+=add;
        if(complemento2.equals(msg)){
            validacao = true;
        }
        else{
            validacao = false;
        }

        if(validacao){
            System.out.println("O programa funciona.");
        }
        else{
            System.out.println("O programa nao funciona.");
        }

    }
}
