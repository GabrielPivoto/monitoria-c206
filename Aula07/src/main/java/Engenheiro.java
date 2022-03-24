public class Engenheiro extends Funcionario{

    public String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    public double salarioAnual(){
        return this.getSalario() * 12;
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " está fazendo um projeto");
    }

}
