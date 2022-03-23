import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Robo r1 = new Robo("C3PO");
        Robo r2 = new Robo("R2D2");
        Robo r3 = new Robo("BB8");
        Robo.setCont(5);

        System.out.println("Quantidade de robos criados: " + Robo.getCont());

        Robo.mostraMensagem(); 

        r1.mostraInfo();
        r2.mostraInfo();
        r3.mostraInfo();

        JOptionPane.showMessageDialog(null,"Hello World");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de n1: "));
        JOptionPane.showMessageDialog(null,"Valor de n1 + 5 :" + (n1+5));
    }
}
