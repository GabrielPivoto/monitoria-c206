public class Conta {

    private static int qtdClientes;
    private double saldo;
    Cliente cliente;

    public Conta(Cliente cliente, double saldo){
        this.cliente = cliente;
        qtdClientes++;
        this.saldo = saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void extrato(){
        System.out.println("Nome do cliente: " + this.cliente.getNome());
        System.out.println("CPF do cliente: " + this.cliente.getCpf());
        System.out.println("Saldo em conta: " + this.saldo);
    }

}
