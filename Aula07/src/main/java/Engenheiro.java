public class Engenheiro extends Funcionario implements GerenciaProjeto, Atividade{

    public String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void tirarFerias(String mes) {
        System.out.println(this.getNome() + " vai tirar férias não sei onde em " + mes);
    }

    public double salarioAnual(){
        return this.getSalario() * 12;
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " está fazendo um projeto");
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " está gerenciando um projeto de software");
    }

    @Override
    public void fazAtividade() {
        System.out.println(this.getNome() + " faz atividade física 4 vezes por semana");
    }

    @Override
    public void finalizaProjeto() {
        System.out.println("Finaizou o projeto");
    }
}
