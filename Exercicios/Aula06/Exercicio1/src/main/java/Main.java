import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: "));

        System.out.printf("Valor da cirunferência: %.2f %n", (Calculadora.circunferencia(raio)));
        System.out.printf("Valor do volume: %.2f %n", (Calculadora.volume(raio)));

    }

}
