package Exercicios;

public class TesteUsuarioSenha {
    public static void main(String[] args) {
        ArquivoTextoUsuarioSenha usuario = new ArquivoTextoUsuarioSenha();
        usuario.openFile();
        usuario.addRecords();
        usuario.closeFile();
    }
}
