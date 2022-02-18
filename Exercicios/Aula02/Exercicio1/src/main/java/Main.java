import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite E ou OU para prosseguir: ");
        String op = sc.nextLine().toUpperCase(); //Faz a entrada e coloca em maiusculo

        switch (op){
            case "E":
                System.out.println("0 E 0 = 0");
                System.out.println("0 E 1 = 0");
                System.out.println("1 E 0 = 0");
                System.out.println("1 E 1 = 1");
                break;
            case "OU":
                System.out.println("0 OU 0 = 0");
                System.out.println("0 OU 1 = 1");
                System.out.println("1 OU 0 = 1");
                System.out.println("1 OU 1 = 1");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();

    }

}
