package banco;
import java.util.Scanner;

public class indexConta {

        public static void main(String[] args) {
        	
        	int x, agencia, conta;
        	String CPF, nome;
        	
        	conta = 1;
        	
        	ContaPoupanca cp1 = new ContaPoupanca(1984, 007, 2000, "8008135-3", "fuyuki");
        	
        	Scanner ler = new Scanner(System.in);
        	System.out.println("==============================");
			System.out.println("1 - Para conta corrente");
			System.out.println("2 - Para conta poupança");
        	x = ler.nextInt();
        	
        	if (x == 1) {
        		System.out.println("Favor inserir agencia (apenas inteiros)");
            	agencia = ler.nextInt();
            	System.out.println("Digite seu CPF");
            	CPF = ler.nextLine();
            	System.out.println("Digite o nome completo");
            	nome = ler.nextLine();
            	
            	ContaCorrente cc = new ContaCorrente(agencia, conta, 2000, CPF, nome);
            	conta++;
            	
            	System.out.println("Deseja mudar o saldo? (1 = s 2 = n)");
            	x = ler.nextInt();
            	
            	if(x == 1) {
            		System.out.println("favor inserir a opção desejada");
					System.out.println("1 - Deposito");
					System.out.println("2 - Tranferencia");
            		x = ler.nextInt();
            		if(x == 1) {
            			double m;
            			System.out.println("Favor digite o valor a ser depositado");
                    	m = ler.nextDouble();
                        cc.deposita(m);
            		} else {
            			double m;
            			String nc;
            			System.out.println("Favor inserir o valor a ser tranferido");
                    	m = ler.nextDouble();
                    	System.out.println("Inserir conta a ser depositado?");
                    	nc = ler.nextLine();
                    	cc. transfere(m, cp1);
            		}
            	}
               
        		
        	}else {
        		
        		System.out.println("Digite sua agencia (apenas inteiros)");
            	agencia = ler.nextInt();
            	System.out.println("Digite seu cpf");
            	CPF = ler.nextLine();
            	System.out.println("Digite seu nome completo");
            	nome = ler.nextLine();
            	
            	ContaPoupanca cp = new ContaPoupanca(agencia, conta, 2000, CPF, nome);
            	conta++;
            	
            	System.out.println("Deseja mudar o saldo? (1 = s 2 = n)");
            	x = ler.nextInt();
            	
            	if(x == 1) {
					System.out.println("Favor digitar uma opção");
            		System.out.println("1 - Deposito ");
					System.out.println("2 - Transferencia ");
            		x = ler.nextInt();
            		if(x == 1) {
            			double m;
            			System.out.println("Favor inserir o valor que deseja depositar");
                    	m = ler.nextDouble();
                        cp.deposita(m);
            		} else {
            			double m;
            			String nc;
            			System.out.println("Digite quanto deseja transferir");
                    	m = ler.nextDouble();
                    	System.out.println("Favor inserir o numero da conta que  deseja depositar?");
                    	nc = ler.nextLine();
                    	cp. transfere(m, cp1);
            		}
            	}
        	}
        }
}
