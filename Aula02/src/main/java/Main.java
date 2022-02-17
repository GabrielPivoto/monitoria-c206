import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1 - Variaveis primitivas
        /*
        int idade;
        float altura;
        double peso;
        boolean flag;
         */

        // String não é primitivo
        /*
        String nome = "Inatel Tecnologias";
        String nomeCortado = nome.substring(0,6);
        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeCortado);
        System.out.println(nomeMaiusculo);

         */

        //Padrão camel case
        /*
        float alturaMedia = 62.5f;
        float valor = 10f;
        double altura = 1.82;
        double saldoContaCorrente;

         */

        //Casting ou Promoção de variavies
        /*
        int n1 = 5;
        int n2 = 2;
        float n3 = (float)n1/n2;
        System.out.println(n3);

        float n4 = 5.5f;
        int n5;
        n5 = (int)n4;
        System.out.println(n5);

         */

        //Print formatado
        /*
        System.out.print("Hello World\n");
        System.out.println("Java");
        System.out.println("Valor da conta : " + (5 + 3));

        double pi = 3.14159;
        System.out.printf("Valor de pi com duas casas = %.2f %n",(pi));

         */

        //Entrada de dados
        /*
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);
        System.out.println("Digite sua altura: ");
        float altura = sc.nextFloat();
        System.out.println("Sua altura é: " + altura);
        sc.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);

         */

        //Condicionais
        /*
        double media = 55.6;
        double freq = 0.75;

        if(media >= 60 && freq >= 0.75)
            System.out.println("Deu bom");
        else if(media < 30 || freq < 0.25)
            System.out.println("Deu ruim, faz de novo");
        else
            System.out.println("NP3");

        String resultado = (media >= 60 && freq >= 0.75)?"Deu bom":"NP3";
        System.out.println(resultado);

        System.out.println((media >= 60)?"Deu bom":"Deu ruim");

        String nome = "Inatel";
        String nomeInatel = "Inatel";

        if(nome.equals(nomeInatel))
            System.out.println("São iguais");
        else
            System.out.println("São diferentes");

        switch (nome){
            case "Inatel":
                System.out.println("São iguais");
                break;
            case "ETE":
                System.out.println("Faço outra coisa aqui");
                break;
        }

         */

        //Estruturas de repetição
        /*
        int cont = 0;
        while(cont <= 10){
            if(cont%2 == 0)
                System.out.println(cont);
            cont++;
        }

         */

        /*
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

         */

        double[] numeros = {1.2,3.5,0.55,.99};
        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

         */

        for(double numero:numeros){
            System.out.println(numero);
        }







    }

}
