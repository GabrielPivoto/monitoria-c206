public class Arquiteto extends Funcionario implements GerenciaProjeto{

    public Arquiteto(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void tirarFerias(String mes) {
        System.out.println(this.getNome() + " vai tirar férias na roça em " + mes);
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " está fazendo uma casa");
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " está gerenciando a construção");
    }

    @Override
    public void finalizaProjeto() {
        System.out.println("Finaizou o projeto");
    }
}
