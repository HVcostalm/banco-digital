package modelo;

public abstract class Conta implements IConta{
	
	private static final int agenciaNumero = 1;
	private static int numeroDistinto = 1;
	private static int digitoVerificadorDistinto = 1;
	
	protected int agencia;
	protected int numero;
	protected int digitoVerificador;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = agenciaNumero;
		this.numero = numeroDistinto++;
		this.digitoVerificador = digitoVerificadorDistinto++;
		this.cliente = cliente;
	}
	@Override
	public boolean sacar(double valor) {
		if(valor<=saldo && valor>0) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente ou valor inválido");
			return false;
		}
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	@Override
	public void transferencia(double valor, IConta contaDestino) {
		if(this.sacar(valor)) {
			contaDestino.depositar(valor);
		} else
			System.out.println("Transferencia nao pode ser realizada. Saldo insuficiente ou valor inválido");
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s",this.cliente.getNome() ));
		System.out.println(String.format("Agencia: %d",this.agencia ));
		System.out.println(String.format("Numero: %d",this.numero ));
		System.out.println(String.format("Saldo: %.2f",this.saldo ));
	}
	
	
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", digitoVerificador=" + digitoVerificador
				+ ", saldo=" + saldo + ", cliente=" + cliente.getNome() + ", emailCliente=" + cliente.getEmail() +"]";
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
}
