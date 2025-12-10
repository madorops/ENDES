package ejercicio2;

public class Card {

	public String suit; // Palo de la carta
	public String value; // Valor de la carta
	
	public Card (String suit, String value) { // Inicializa palo y valor
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}