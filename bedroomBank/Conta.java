package bedroomBank;

public class Conta {
	
	private int agencia;
	private String numeroConta;
	private Cliente titular;
	private double saldo;
	
	public Conta(int agencia, String numeroConta, Cliente titular) {
		
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.0;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular.getNome();
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String sacar(double valor) {
		String saque_valido = "";
		if(this.getSaldo() >= valor)
			
			this.saldo-=valor;
		else {
			saque_valido = "Saldo indisponível";
		}
		return saque_valido;
	}
	
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	
	public void transferir(Conta c, double valor) {
		
		if(this.sacar(valor).equals("Saldo indisponível")) {
			
		}else {
		
		c.depositar(valor);
		}
	}
	
	
}
