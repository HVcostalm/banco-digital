package principal;

import modelo.Banco;
import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Conta;
import modelo.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		Banco bradesco = new Banco("Bradesco");
		Cliente joao = new Cliente("Joao Pedro", "147596625-81", "jp23@gmail.com");
		Cliente matheus = new Cliente("Matheus Rocha", "254489623-15","mathrock@gmail.com");
		Conta contaJoao = new ContaCorrente(joao);
		Conta contaMatheus = new ContaPoupanca(matheus);
		
		bradesco.adicionarContaBanco(contaMatheus);
		bradesco.adicionarContaBanco(contaJoao);
		
		contaJoao.depositar(500);
		contaMatheus.depositar(100);
		
		contaJoao.imprimirExtrato();
		contaMatheus.imprimirExtrato();
		
		contaJoao.transferência(600, contaMatheus);
		
		contaJoao.imprimirExtrato();
		contaMatheus.imprimirExtrato();
		
		contaJoao.sacar(300);
		contaMatheus.sacar(100);
		
		contaJoao.imprimirExtrato();
		contaMatheus.imprimirExtrato();
		
		contaJoao.transferência(400, contaMatheus);
		
		contaJoao.imprimirExtrato();
		contaMatheus.imprimirExtrato();
		
		contaMatheus.transferência(250, contaJoao);
		
		contaJoao.imprimirExtrato();
		contaMatheus.imprimirExtrato();
		
		bradesco.exibirContas();
	}

}
