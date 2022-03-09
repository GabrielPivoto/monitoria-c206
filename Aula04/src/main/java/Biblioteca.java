public class Biblioteca {

    String nome;
    Livro[] livros = new Livro[100];

    void cadastrarLivro(Livro livro){
        for (int i = 0; i < this.livros.length; i++) {
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome da biblioteca: " + this.nome);
        System.out.println("** Livros Disponíveis: **");
        for (int i = 0; i < this.livros.length; i++) {
            if (livros[i] != null){
                System.out.println((i + 1) + "o. Livro:");
                livros[i].mostraInfo();
            }
        }
    }

}
