package banco;

public class ContaCorrente extends conta {
	
	public ContaCorrente(int agencia, int numero, double saldo, String CPF, String titular) {
		super(agencia, numero, saldo, CPF, titular);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

}
