public class SemSaldoException extends Exception{
    
    public SemSaldoException(double valor){
        System.out.println("Você tentou sacar " + valor + ", mas seu saldo é insuficiente!");
    }

}
