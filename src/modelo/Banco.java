package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarContaBanco(Conta conta) {
		contas.add(conta);
	}
	
	public void exibirContas() {
		System.out.println(contas);
	}
	
}
