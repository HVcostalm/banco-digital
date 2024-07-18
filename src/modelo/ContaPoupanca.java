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

	public void rendimentoPorMes(int mes) {
		System.out.println(this.cliente.getNome() + ", seu rendimento ao deixar seu dinheiro atual no banco por " + mes + " mes(es) é: " +this.saldo*0.01*mes);
	}

}
