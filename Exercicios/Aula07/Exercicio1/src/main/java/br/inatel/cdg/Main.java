package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {

        Notebook n = new Notebook("A52 Liv",7600,500,"GTX 1650 TI","I5 10Th Gen");
        Camiseta c = new Camiseta("Camiseta",49.90,"Preto","M");

        System.out.println("Etiqueta do Notebook: " + n.etiquetaPreco() + "\n");
        System.out.println("Etiqueta do Camiseta: " + c.etiquetaPreco() + "\n");

    }

}
