package Simples;

public class Main {

	public static void main(String[] args) {
		
//		ContaEspecial accEsp = new ContaEspecial("NuBank", 2, 333022, 22.50, 0, 1500);
//		System.out.println(accEsp);
//		
//		accEsp.deposito(50);
//		System.out.println(accEsp);
//	
//		accEsp.saque(35.50);
//		System.out.println(accEsp);
		
		ContaSimples accSim = new ContaSimples("NuBank", 2, 333022, 22.50, 50);
		System.out.println(accSim);
		
		accSim.depositoPoupanca(105);
		System.out.println(accSim);
		
		accSim.saquePoupanca(100);
		System.out.println(accSim);
	
	}
}
