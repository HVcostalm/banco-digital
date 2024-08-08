package modelo;

public interface IConta {
	boolean sacar(double valor);
	
	void depositar(double valor);
	
	void transferencia(double valor, IConta contaDestino);
	
	void imprimirExtrato();

}
