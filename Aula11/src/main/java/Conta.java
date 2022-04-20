public class Conta implements Comparable<Conta>{

    int saldo;
    String dono;

    public Conta(int saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    @Override
    public int compareTo(Conta c) {
        return dono.compareTo(c.dono);
    }

    /*
    @Override
    public int compareTo(Conta c) {
        return Integer.compare(this.saldo,c.saldo);
    }

     */


}
