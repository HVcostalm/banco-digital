package modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("-- IMPRIMINDO EXTRATO CONTA POUPANCA--");
		super.imprimirInfos();
	}

	public double rendimentoPorMes(int mes) {
		return this.saldo*0.01*mes;
	}

}
