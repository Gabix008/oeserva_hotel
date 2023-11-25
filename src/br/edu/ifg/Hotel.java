package br.edu.ifg;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
	private String nome;
	private String endereco;
	private Map<Integer, Quarto> quartos = new HashMap<>();
	private String descricao;
	private boolean pagamentoAnte;
	
	public Hotel(String nome, String endereco, String descricao, boolean pagamentoAnte) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.descricao = descricao;
		this.pagamentoAnte = pagamentoAnte;
	}
	
	public void cadastrarQuarto(Usuario usuario, double preco, String decricao, int qtdCama) {
		boolean permissao = usuario.validarPermissao();
		boolean status = this.validarDados(preco, decricao, qtdCama);
		Map<Integer, Quarto> quartos = new HashMap<>();
		
		if(!permissao) {
			System.out.println("Acesso Negado");
			return;
		}
		
		if(!status) {
			System.out.println("Preencha todos os campos");
			return;
		}	
	
		Quarto quarto = new Quarto(preco, decricao, qtdCama, this.getQuartos().size()+1);
		
		quartos.put(this.getQuartos().size()+1, quarto);
		
		System.out.println("Quarto criado");
	}
	
	private boolean validarDados(double preco, String decricao, int qtdCama) {
		boolean status = true;
		
		if(decricao.isEmpty()) status = false;
		if(preco < 0) status = false;
		if(qtdCama <= 1) status = false;
		
		return status;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Map<Integer, Quarto> getQuartos() {
		return quartos;
	}
	public void setQuartos(Map<Integer, Quarto> quartos) {
		this.quartos = quartos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isPagamentoAnte() {
		return pagamentoAnte;
	}
	public void setPagamentoAnte(boolean pagamentoAnte) {
		this.pagamentoAnte = pagamentoAnte;
	}
	
	
}