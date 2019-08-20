import java.util.Scanner;
public class Lemonade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the lemonade stand. \nHow many drinks would you like to buy?");
			Scanner fluffy = new Scanner (System.in);
			int amount = fluffy.nextInt();
			double price = (amount*1.5);
		if (amount > 0 ) {
			System.out.println("The price will be " + price);
	}	else { 
			System.out.println("WHAAAAAAAAAAA! \nYour loss, we are very refreshing! ");
		}
	}
}