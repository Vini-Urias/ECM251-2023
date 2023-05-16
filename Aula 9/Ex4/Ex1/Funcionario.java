
public class Funcionario extends Pessoa{
    private double salario;
    private String cargo;

    public Funcionario(){
        super();
        salario = 0.0;
        cargo = " ";
    }

    public Funcionario(String nome, int idade, double salario, String cargo){
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double salario(){
        return salario;
    }

    public int categoria(){
        if(super.getIdade() > 20){
            return 30;
        }
        else{
            return 10;
        }
    }

}
