public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    public Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    void mostraInfo(){
        System.out.println("Código de série: " + this.codigoSerie);
        System.out.println("Código do produto: " + this.codigoProduto);
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Caregoria: " + this.categoria);
        System.out.println("Quantidade em estoque: " + this.quantidade + "\n");
    }

}
