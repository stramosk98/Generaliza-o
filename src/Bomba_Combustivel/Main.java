package Bomba_Combustivel;

public class Main {

	public static void main(String[] args) {
		BombaEtanol be = new BombaEtanol(50, 4.50f);
		System.out.println(be);
		
//		be.abastecerPorLitro(30);
//		System.out.println(be);
		
		be.abastecerPorValor(200);
		System.out.println(be);
	}

}
