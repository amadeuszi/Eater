
public class Main {
	public static void main(String[] args) {
		Init.init();
		Operations operations = new Operations();
		operations.showRecipies();
		operations.user.addRecipie(1);
		operations.user.addRecipie(2);
		operations.updateMyShelf();
		operations.createShoppingList();
		operations.user.showShoppingList();
		operations.convertFromShoppingListToProductList();
		operations.user.showProductList();
		operations.addRecipie("Fish and chips", "Fish to the oven for 30 mins, fry chips on pan for 10 mins", null, null);
		operations.close();
		System.out.println("ok");
	}
}
