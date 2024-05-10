package desafio_DIO_banco;

public class Main {

	public static void main(String[] args) {
		Cliente janine = new Cliente();
		janine.setNome("Janine");
		
		Conta cc = new ContaCorrente(janine);
		
		cc.depositar(200);
		
		cc.imprimirExtrato();
		
		Conta poupanca = new ContaPoupanca(janine);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		
		cc.pagamentoContas("157893475159971", 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
