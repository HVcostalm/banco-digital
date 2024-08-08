package modelo;

import java.util.Scanner;

public class ContaCorrente extends Conta{
	
	private static final int limiteEspecialBanco = 400;
	private int limiteEspecial;
	private Scanner scanner = new Scanner(System.in);
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.limiteEspecial = limiteEspecialBanco;
	}
	
	public boolean sacar(double valor) {
		String confirmacao;
		if(valor<=this.saldo && valor>0) {
			this.saldo -= valor;
			return true;
		}
		else if(valor<=(this.limiteEspecial+this.saldo)) {
			System.out.println("Saldo insuficiente, mas seu limite especial cobre seu saque");
			System.out.println("Voce deseja realizar o saque utilizando o limite especial? [Sim/Nao]");
			confirmacao = scanner.next();
			if(confirmacao.equalsIgnoreCase("sim"))
				{
					this.limiteEspecial -= (valor-this.saldo);
					this.saldo=0;
					return true;
				} else {
					System.out.println("Saque nao realizado");
					return false;
				}
		} else {
			System.out.println("Saldo insuficiente ou valor inválido");
			return false;
		}
	}
	
	
	@Override
	public void imprimirExtrato() {
		System.out.println("-- IMPRIMINDO EXTRATO CONTA CORRENTE--");
		super.imprimirInfos();
		System.out.println(String.format("Limite Especial: %d",this.limiteEspecial));
	}

	public int getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(int limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	
}
