package org.java;

public class ElencoInteri {

	private int[] numbers;
	private int currentIndex;

	// constructor
	public ElencoInteri(int[] numbers) {

		setNumbers(numbers);
		currentIndex = 0;
	}

	//getters and setters
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//methods
	public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            int element = numbers[currentIndex];
            currentIndex = (currentIndex + 1) % numbers.length; 
            return element;
        } else {
            throw new IllegalStateException("Nessun elemento rimasto.");
        }
    }

    public boolean hasAncoraElementi() {
        return currentIndex < numbers.length;
    }
}