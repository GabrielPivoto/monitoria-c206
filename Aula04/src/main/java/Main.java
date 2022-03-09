import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Livro l; // Uma referencia para livro

        Livro[] estante = new Livro[5]; // Cinco referencias para livros


        // Uma forma de contornar o NullPointerException
        for (int i = 0; i < estante.length; i++) {
            estante[i] = new Livro();
        }


        //Crio um livro e coloco na estante
        Livro l1 = new Livro();
        l1.nome  = "O nome do vento";
        l1.qtdPaginas = 600;
        estante[0] = l1;

        //Instanciar o livro direto no array
        estante[1] = new Livro();
        estante[1].nome = "O temor do sábio";
        estante[1].qtdPaginas = 900;

        for (int i = 0; i < estante.length; i++) {
            System.out.println(estante[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < estante.length; i++) {
            if(estante[i] != null) {
                estante[i].mostraInfo();
            }
        }
        
    }

}
