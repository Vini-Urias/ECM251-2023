public class FuncionarioAposentado extends Funcionario {
    private double salarioAposentadoria;

    public FuncionarioAposentado(String nome, int idade, double salarioAposentadoria){
        super(nome, idade, salarioAposentadoria, " ");
    }

    public double getSalarioAposentadoria() {
        return this.salarioAposentadoria;
    }

    public void setSalarioAposentadoria(double salarioAposentadoria) {
        this.salarioAposentadoria = salarioAposentadoria;
    }

    public double salario(){
        return salarioAposentadoria;
    }


}
