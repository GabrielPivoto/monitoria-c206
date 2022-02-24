import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Funcionario func1; //Uma referencia para funcionario
        func1 = new Funcionario(); //Instancia de um objeto
        System.out.println("Digite o nome do funcionário: ");
        func1.nome = sc.nextLine();

        Funcionario func2 = new Funcionario("Garibaldo",30,2,1500);

        //func1.mostraInfo();
        //func2.mostraInfo();

        double salario = func1.calculaSalarioAnual();
        System.out.println("Salário do " + func1.nome + " eh: " + salario);

        System.out.println("Salário do " + func2.nome + " eh: " + func2.calculaSalarioAnual(200));
        sc.close();

         */

        //Composicao - Nave ja eh criado com a Arma
        /*
        Nave n1 = new Nave();
        n1.nome = "Razor Crest";
        n1.velocidade = 200;
        n1.velocidadeDaLuz = true;
        n1.arma.tipo = "Canhao";
        n1.arma.poder = 400;
         */

        //Agragacao - Arma criada separadamente e adicionada a Nave depois
        Nave n2 = new Nave();
        n2.nome = "Milenium Falcon";
        n2.velocidade = 400;
        n2.velocidadeDaLuz = true;
        Arma arma = new Arma();
        arma.tipo = "Canhão";
        arma.poder = 500;
        n2.addArma(arma);

        n2.mostraInfo();



    }

}
