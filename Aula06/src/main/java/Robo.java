public class Robo {

    private static int cont;
    public String nome;
    public int nSerie;

    public Robo(String nome){
        this.nome = nome;
        cont++;
        this.nSerie = cont;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de série: " + this.nSerie + "\n");
    }

    public static void mostraMensagem(){
        System.out.println("Uma mensagem qualquer!");
    }

    public static void setCont(int cont){
        Robo.cont = cont;
    }

    public static int getCont(){
        return Robo.cont;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
