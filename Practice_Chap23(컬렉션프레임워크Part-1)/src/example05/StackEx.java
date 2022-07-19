package example05;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("²¨³»¿Â µ¿Àü : " + coin.getValue());
		}
		

	}

}
