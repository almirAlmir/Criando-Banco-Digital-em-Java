package bedroomBank;

public class Cliente {

	private String nome;
	private String cpf;
	private String nome_mae;
	
	public Cliente(String nome, String cpf, String nome_mae) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.nome_mae = nome_mae;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome_mae() {
		return nome_mae;
	}
	
	
	
}
