package view;

import controller.MultiplicarController;

public class Principal {

	public static void main(String[] args) {
		MultiplicarController multiplicarController = new MultiplicarController();
		
		int a = 5;
		int b = 4;
		
		int resultado = multiplicarController.multiplicarNumero(a, b);
		System.out.println("O resultado da multiplicação de " + a + " por " + b + " é: " + resultado);
	}
}
