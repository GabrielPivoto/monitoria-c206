public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(new Cliente("Garibaldo",123),1500);
        conta.deposita(2000);
        conta.saca(250);
        conta.extrato();

    }

}
