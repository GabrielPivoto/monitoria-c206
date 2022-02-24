public class Funcionario {

    //Atributos - caracteristicas de um funcionario
    String nome;
    int idade;
    int cpf;
    double salario;

    //Metodos - ações de um funcionário
    Funcionario(String nome, int idade, int cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.idade = idade;
        System.out.println("Um funcionário foi efetivado");
    }

    Funcionario(){

    }

    void tirarFerias(String mes){
        System.out.println(this.nome + "tirou férias em " + mes);
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario + "\n");
    }

    double calculaSalarioAnual(){
        /*
        double salarioAnual;
        salarioAnual = this.salario * 12;
        return  salarioAnual;
         */
        return this.salario * 12;
    }

    double calculaSalarioAnual(double decimoTerceiro){
        return this.salario * 12 + decimoTerceiro;
    }


}
