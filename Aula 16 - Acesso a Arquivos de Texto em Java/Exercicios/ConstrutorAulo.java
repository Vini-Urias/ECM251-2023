package Exercicios;

public class ConstrutorAulo {
    private String nome;
    private String sobrenome;
    private String ra;
    private Double p1;
    private Double p2;
    private Double p3;
    private Double p4;

    public ConstrutorAulo(){
        nome = "";
        sobrenome = "";
        ra = "";
        p1 =0.0;
        p2 =0.0;
        p3 =0.0;
        p4 =0.0;
    }

    public ConstrutorAulo(String n, String s, String r, Double p1, Double p2, Double p3, Double p4){
        nome = n;
        sobrenome = s;
        ra = r;
        this.p1 =p1;
        this.p2 =p2;
        this.p3 =p3;
        this.p4 =p4;
    }

    public void setNome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setSobrenome(String s){
        sobrenome = s;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setRa(String r){
        ra = r;
    }

    public String getRa(){
        return ra;
    }

    public void setP1(Double p1){
        this.p1 = p1;
    }

    public Double getP1(){
        return p1;
    }


    public void setP2(Double p2){
        this.p2 = p2;
    }

    public Double getP2(){
        return p2;
    }

    public void setP3(Double p3){
        this.p3 = p3;
    }

    public Double getP3(){
        return p3;
    }

    public void setP4(Double p4){
        this.p4 = p4;
    }

    public Double getP4(){
        return p4;
    }
}
