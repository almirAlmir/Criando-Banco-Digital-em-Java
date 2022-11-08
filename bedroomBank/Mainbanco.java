package bedroomBank;

public class Mainbanco {

	public static void main(String[] args) {
		Banco banco1 = new Banco();
		Cliente cliente1 = new Cliente("Almir Alves", "11312014423", "Jacirley Alves da Silva");
		Conta c1 = new Corrente(425, "4002-19978-21", cliente1);
		
		System.out.println(banco1.addConta(c1));
		c1.depositar(45.50);
		
		System.out.println(banco1.getContas());
		Cliente cliente2 = new Cliente("Vitoria Raisa", "43405894468", "Maria");
		Conta c2 = new Poupanca(194, "977865-h32", cliente2);
		
		
		System.out.println(banco1.addConta(c2));
		System.out.println(banco1.getContas());
		
		c1.transferir(c2, 15.0);
		
		System.out.println(banco1.getContas());

	}

}
