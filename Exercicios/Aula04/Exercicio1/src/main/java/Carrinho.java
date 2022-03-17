public class Carrinho {
    public double total;
    public Produto[] produtos;

    public Carrinho(){
        this.produtos = new Produto[10];
    }

    public void exibirInfos(){
        for (Produto produto : produtos) {
            if(produto != null){
                System.out.println("Nome do produto: " + produto.nome);
                System.out.println("Descrição do produto: " + produto.descricao);
                System.out.println("Fabricante do produto: " + produto.fabricante);
                System.out.println("Preço do produto: " + produto.preco + "\n");
            }
        }
    }

    public double calculaTotal(){
        total = 0;
        for (Produto produto : produtos) 
            if(produto != null)
                total += produto.preco;
        return total;
    }
}
