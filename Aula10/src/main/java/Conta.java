public class Conta {

    public double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void sacarDeUmJeito(double valor){
        try{
            if(valor >= saldo)
                throw new SemSaldoException(valor);
            else{
                System.out.println("Você sacou: " + valor);
                saldo -= valor;
            }
        }catch(SemSaldoException e){
            System.out.println("Saldo insuficiente!");
            System.out.println(e);
        }
        System.out.println("Saldo em conta: " + this.saldo);
    }

    public void sacarDeOutroJeito(double valor) throws SemSaldoException{
        if(valor >= saldo)
            throw new SemSaldoException(valor);
        else{
            System.out.println("Você sacou: " + valor);
            saldo -= valor;
        }
        System.out.println("Saldo em conta: " + this.saldo);
    }
    
}
