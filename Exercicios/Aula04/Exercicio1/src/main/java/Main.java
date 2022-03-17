public class Main {
    public static void main(String[] args) {
        
        Carrinho c = new Carrinho();
        c.produtos[0] = new Produto("Nescau","Alimento","Nestle",10);
        c.produtos[1] = new Produto("Coca Cola","Refigerante","Coca Cola",15.50);
        c.produtos[2] = new Produto("Galaxy S20","Eletrônico","Samsung",2500);
        c.produtos[3] = new Produto("Kindle","Eletrônico","Amazon",360);
        
        c.exibirInfos();

        System.out.println("Preço total do carrinho: " + c.calculaTotal());

    }
}
