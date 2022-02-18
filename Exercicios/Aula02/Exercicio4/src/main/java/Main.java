import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String SENHA_CORRETA = "2002";
        System.out.println("Digite sua senha: ");
        String tentativa = sc.nextLine();

        while(!(tentativa.equals(SENHA_CORRETA))){
            System.out.println("Senha inválida! Acesso negado!");
            System.out.println("Digite novamente sua senha: ");
            tentativa = sc.nextLine();
        }

        System.out.println("Acesso permitido!");
        sc.close();

    }

}
