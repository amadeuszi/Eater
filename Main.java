import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Init.init();
		Operations operations = new Operations();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Double> y = new ArrayList<>();
		x.add(4);
		y.add(2.0);
		operations.addRecipie("Fish and chips", "Fish to the oven for 30 mins, fry chips on pan for 10 mins", x, y);
		operations.showRecipies();
		operations.user.addRecipie(1);
		operations.user.addRecipie(2);
		operations.updateMyShelf();
		operations.createShoppingList();
		operations.user.showShoppingList();
		operations.convertFromShoppingListToProductList();
		operations.user.showProductList();

		operations.close();
		System.out.println("ok");
	}
}
