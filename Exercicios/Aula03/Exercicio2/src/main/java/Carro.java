public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    Carro(String cor, String marca, String modelo, double velocidadeMax, double velocidadeAtual, Motor motor) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.motor = motor;
    }

    void mostraInfo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
        System.out.println("Velocidade máxima: " + this.velocidadeMax);
        if(this.motor != null){
            System.out.println("Tipo do motor: " + this.motor.tipo);
            System.out.println("Potencia do motor: " + this.motor.potencia);
        }else
            System.out.println("O carro ainda está sem motor");
    }
}
