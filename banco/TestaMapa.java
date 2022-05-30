package banco;

import java.util.HashMap;
import java.util.Map;

//exercicio 3

public class TestaMapa {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(0258, 025, 3000, "5874025-8", "Maria");
		c1.deposita(50000);

		ContaCorrente c2 = new ContaCorrente(6589, 658, 500, "6587458-0", "Sandra");
		c2.deposita(25000);

		// cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<String, ContaCorrente>();

		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// qual a conta do diretor?
		ContaCorrente contaDoDiretor = (ContaCorrente) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}