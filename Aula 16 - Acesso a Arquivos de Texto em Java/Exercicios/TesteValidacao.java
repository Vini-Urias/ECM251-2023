package Exercicios;

public class TesteValidacao {
    public static void main(String[] args) {
        ValidacaoUsuarioSenha usuario = new ValidacaoUsuarioSenha();
        usuario.openFile();
        usuario.readRecords();
        usuario.closeFile();


    }
}
