public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];

        Professor p = new Professor("Chris",27,15000,"POO");
        Engenheiro e = new Engenheiro("Tonho",46,5600,"Software");
        Arquiteto a = new Arquiteto("Fabiola",34,4500);

        funcionarios[0] = e;
        funcionarios[1] = p;
        funcionarios[2] = a;
        Professor prof;

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Professor){
                    System.out.println("Esta posição tem um Professor");
                    prof = (Professor) funcionarios[i];
                    prof.mostraInfo();
                    prof.fazAlgo();
                    prof.corrigeProvas();
                    System.out.println("");
                }else if(funcionarios[i] instanceof Engenheiro){
                    System.out.println("Esta posição tem um Engenheiro");
                    Engenheiro eng = (Engenheiro) funcionarios[i];
                    eng.mostraInfo();
                    eng.salarioAnual();
                    eng.fazAlgo();
                    System.out.println("");
                }else{
                    System.out.println("Esta posição tem um Arquiteto");
                    Arquiteto arq = (Arquiteto) funcionarios[i];
                    arq.mostraInfo();
                    arq.fazAlgo();
                }
            }
        }




    }

}
