import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList(); // Estrutura heterogenea
        Conta c = new Conta(200,"Garibaldo");
        lista.add(10);
        lista.add(4.5f);
        lista.add(false);
        lista.add(c);
        lista.add("Inatel");
        lista.add(new Conta(500,"Jaum"));

        System.out.println(lista.contains("Inatel"));

        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println(" ");

        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(3);
        inteiros.add(6);
        inteiros.add(1);
        inteiros.add(7);
        inteiros.add(34);
        inteiros.add(-6);

        for(Integer inteiro: inteiros){
            System.out.println(inteiro);
        }
        System.out.println(" ");
        System.out.println("Antes de ordenar: " + inteiros + "\n");

        Collections.sort(inteiros);
        Collections.reverse(inteiros);

        System.out.println("Depois de ordenar: " + inteiros + "\n");


        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta(300,"Rubinho"));
        contas.add(new Conta(150,"Chris"));
        contas.add(new Conta(455,"Garibaldo"));
        contas.add(new Conta(21,"Mirtes"));

        System.out.println("Antes de ordenar: ");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono da conta: " + contas.get(i).dono);
            System.out.println("Saldo em conta: " + contas.get(i).saldo + "\n");
        }

        Collections.sort(contas);

        System.out.println("Antes de ordenar: ");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono da conta: " + contas.get(i).dono);
            System.out.println("Saldo em conta: " + contas.get(i).saldo + "\n");
        }

        System.out.println( " ");
        //HashMap

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Gabriel",22);
        mapa.put("Laura",19);
        mapa.put("Gustavo",17);
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        System.out.println(" ");

        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(3);
        set.add(6);
        set.add(3);
        set.add(-4);
        set.add(67);
        set.add(6);
        set.add(8);
        set.add(90);
        set.add(-10);

        System.out.println(set);

    }

}
