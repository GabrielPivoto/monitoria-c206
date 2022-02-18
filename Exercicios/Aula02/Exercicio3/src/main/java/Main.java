import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){

            System.out.println("Digite o primeiro número: ");
            double n1 = sc.nextDouble();

            System.out.println("Digite o segundo número: ");
            double n2= sc.nextDouble();

            System.out.println("Opções disponíveis: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.println("Digite sua opção: ");

            int op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println((n2 == 0)?"Erro matemático: divisão por zero":n1 + " / " + n2 + " = " + n1/n2);
                    break;
                case 5:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();

    }

}
