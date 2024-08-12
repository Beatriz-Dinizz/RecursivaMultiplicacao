package controller;

public class MultiplicarController {

	public MultiplicarController() {
		super();
	}
	
	public int multiplicarNumero(int a, int b) {
		if(b == 0) {
			return 0;
		}
		
		return a + multiplicarNumero(a, b - 1);
	}
}
