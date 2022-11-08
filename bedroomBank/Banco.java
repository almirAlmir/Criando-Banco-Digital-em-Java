package bedroomBank;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas;
	
	public Banco() {
		
		this.contas = new ArrayList<Conta>();
	}

	public List<Conta> getContas() {
		return contas;
	}

	public String addConta(Conta c) {
		
		this.contas.add(c);
		return "Conta adicionada";
	}
	
	
}
