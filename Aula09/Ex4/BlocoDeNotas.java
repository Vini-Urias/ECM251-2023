import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas;

    public BlocoDeNotas(){
        notas  = new ArrayList<String>();
    }

    public void addNotas(String notas){
        this.notas.add(notas);
    }

    public void getNotas(){
        for(String s:notas){
           System.out.println(" "+s);
        }
    }

    public void removeNotas(int i){
        notas.remove(i);
    }

    public void listarNotas(){
        String msg = "\n";
        for(int i=0;i<notas.size();i++){
            msg += "\nNota "+(i+1)+"\n"+notas.get(i)+"\n";
        }
        System.out.println(msg);
    }

    public void alterarNotas(String s, int i){
        notas.set(i,s);
    }
}
