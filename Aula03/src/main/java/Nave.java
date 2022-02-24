public class Nave {

    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma = new Arma(); // Composicao
    //Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
        //this.arma = new Arma(); // outra forma de composicao
    }

    Nave(){

    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println((this.velocidadeDaLuz)?"Viaja na velocidade da luz":"Não viaja na velocidade da luz");
        if(this.arma != null){
            System.out.println("Tipo da arma: " + this.arma.tipo);
            System.out.println("Poder da arma: " + this.arma.poder);
        }else
            System.out.println("A nave não possui arma");
    }

    void addArma(Arma arma){
        this.arma = arma;
    }

}
