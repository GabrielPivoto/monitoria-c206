import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Conta[] contas = new Conta[3];

        try{
            contas[0] = new Conta(100);
            contas[1] = new Conta(200);
            contas[2] = new Conta(300);
            contas[3] = new Conta(50);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inexistente!");
        }
        

        try{

            for (int i = 0; i < contas.length; i++) {
                System.out.println("Saldo em conta: " + contas[i].saldo);
            }

        }catch(NullPointerException e){

            System.out.println("Deu ruim");
            System.out.println(e);

        }

        System.out.println("O código deve continuar");


        Scanner sc = new Scanner(System.in);


        try{

            System.out.println("Digite o valor de n1: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o valor de n2: ");
            int n2 = sc.nextInt();
            System.out.println("Resultado da divisão: " + (n1/n2));

        }catch(ArithmeticException e){
            System.out.println("Impossível fazer divisão por 0");
        }catch(InputMismatchException e){
            System.out.println("Tipo de entrada errada!");
        }finally{
            System.out.println("Executa de qualquer jeito");
        }
        */

       

        Conta c2 = new Conta(700);

        try{
            c2.sacarDeOutroJeito(800);
        }catch(SemSaldoException e){
            System.out.println(e);
        }
        
        
        
    }
}
