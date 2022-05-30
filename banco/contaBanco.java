package banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contaBanco {
	
	private double saldo;
    private int agencia;
    private int numero;
    private String CPF;
    private String titular;
    private static int total = 0;

    public conta(int agencia, int numero, double saldo2, String cPF2, String titular2) {
        conta.total++;        
        this.agencia = agencia;
        this.numero = numero;
    }

	public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("-----ATENÇÃO-----");
            System.out.println("Não é possivél inserir valores negativos");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("-----ATENÇÃO-----");
            System.out.println("Não é possivél inserir valores negativos");
            return;
        }
        this.agencia = agencia;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    private String getTitular() {
		return this.titular;
	}
    
    public void setCPF (String CPF) {
    	this.CPF = CPF;
    }
    
    public void setSaldo(double saldo) {
        if(saldo <= 0) {
            System.out.println("-----ATENÇÃO-----");
            System.out.println("Não é possivél inserir valores negativos");
            return;
        }
        this.saldo = saldo;
    }

    public static int getTotal() {
        return conta.total;
    }
    
    private List<conta> contas = new ArrayList<>();
    private Map<String, conta> indexadoPorNome = new HashMap<>();
    
    public void adiciona(conta conta) {
		contas.add(conta);
		indexadoPorNome.put(conta.getTitular(), conta);
	}

	public conta pega(int posicao) {
		return contas.get(posicao);
	}

	public int getQuantidadeDeContas() {
		return contas.size();
	}
	
	public conta buscaPorTitular(String nomeDoTitular) {
		return indexadoPorNome.get(nomeDoTitular);
	}
}
