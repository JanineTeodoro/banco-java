package desafio_DIO_banco;

public class Main {

	public static void main(String[] args) {
		Cliente janine = new Cliente();
		janine.setNome("Janine");
		
		Conta cc = new ContaCorrente(janine);
		
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(janine);
		
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
