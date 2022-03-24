public class Professor extends Funcionario{

    public String materia;

    public Professor(String nome, int idade, double salario, String materia){
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigeProvas(){
        System.out.println(this.getNome() + " está corrigindo provas");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Matéria: " + this.materia);
    }

    @Override
    public double salarioBonus(){
        return super.salarioBonus() + 300;
    }

    @Override
    public void fazAlgo() {
        System.out.println(this.getNome() + " está dando aula de " + this.materia);
    }
}
