package Veiculo;

public class Main {

	public static void main(String[] args) {
		Moto moto = new Moto(true, 125);
		System.out.println(moto);
		
		Caminhao caminhao = new Caminhao(true, 8);
		System.out.println(caminhao);
		
		Carro carro = new Carro(true, 4);
		System.out.println(carro);
	}

}
