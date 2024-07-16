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
		if(valor<=saldo) {
			saldo -= valor;
			return true;
		}
		else
			valor = valor - saldo;
			if(valor<=limiteEspecial) {
				System.out.println("Saldo insuficiente, mas seu limite especial cobre seu saque");
				System.out.println("Voce deseja realizar o saque utilizando o limite especial? [Sim/Nao]");
				confirmacao = scanner.next();
				if(confirmacao.equalsIgnoreCase("sim"))
				{
					this.saldo=0;
					this.limiteEspecial -= valor;
					return true;
				} else {
					System.out.println("Saque nao realizado");
					return false;
				}
			} else {
				System.out.println("Saldo insuficiente");
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
	
	
	
}
