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

        Nave n1 = new Nave();
        n1.arma.tipo = "Canhao";
        n1.arma.poder = 400;

        Arma arma = new Arma();
        //arma.tipo = "Canhão";
        //arma.poder = 500;
        n1.addArma(arma);

        n1.mostraInfo();



    }

}
