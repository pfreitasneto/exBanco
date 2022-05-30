package banco;

import java.util.HashSet;

//exercicio 8

public class TestaSetDeConta {

    public static void main(String[] args) {
        HashSet<ContaCorrente> contas = new HashSet<>();

        ContaCorrente c1 = new ContaCorrente(0, 0, 0, null, null);
        c1.setNumero(1);
        c1.setAgencia(5506);
        c1.setTitular("Lucas Castro");
        c1.setCPF("417824");
        c1.setSaldo(1000000000.00);

        ContaCorrente c2 = new ContaCorrente(0, 0, 0, null, null);
        c2.setNumero(1);
        c2.setAgencia(5698);
        c2.setTitular("Felipe souza");
        c1.setCPF("025417");
        c1.setSaldo(1);

        ContaCorrente c3 = new ContaCorrente(0, 0, 0, null, null);
        c3.setNumero(2);
        c3.setAgencia(1258);
        c3.setTitular("Paulo Robeto");
        c1.setCPF("254178");
        c1.setSaldo(1000000.00);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        System.out.println("Total de contas no HashSet: " + contas.size());
    }
}
