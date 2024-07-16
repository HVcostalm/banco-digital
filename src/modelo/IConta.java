package modelo;

public interface IConta {
	boolean sacar(double valor);
	
	void depositar(double valor);
	
	void transferência(double valor, IConta contaDestino);
	
	void imprimirExtrato();

}
