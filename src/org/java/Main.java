package org.java;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arrayDiInteri = {1, 2, 3, 4, 5};

        ElencoInteri elenco = new ElencoInteri(arrayDiInteri);

        while (elenco.hasAncoraElementi()) {
            int elemento = elenco.getElementoSuccessivo();
            System.out.println("Elemento: " + elemento);
        }
	}

}
