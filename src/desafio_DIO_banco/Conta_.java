package desafio_DIO_banco;

public interface Conta_ {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void pagamentoContas(String codigo, double valor);
	
	void imprimirExtrato();
}
