package idv.workshop.homework;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    /*
    * Shopping spec:
    * As a shopping cart, it should be able to:
    *
    * 1. Add product into it.
    * 2. Remove a specified product from the cart.
    * 3. Remove several products from cart.
    * 4. Remove all products from the cart.
    * 5. Count how many types of products in it. (How many types?)
    * 6. Count total quantity of products in it. (How many products: means total quantity.)
    * 7. Calculate the total price of the cart.
    * 8. Find the specified product is in the cart or not. (No matter how quantity it is.)
    *
    * */

    private ArrayList<Product> products = new ArrayList<>();

    // 1. Add product into cart.
    public void addIntoCart(Product product) {
        products.add(product);
    }

    // 2. Remove a specified product from the cart.
    public boolean removeASpecifiedProducts(Product product) {
        return products.remove(product);
    }

    // 3. Remove several products from cart.
    public boolean removeProducts(List<Product> productsNeedToBeRemoved) {
        return this.products.removeAll(productsNeedToBeRemoved);
    }

    // 4. Remove all products from the cart.
    public void removeAll() {
        products.clear();
    }

    // 5. Count how many types of products in it.
    public int getNumberOfProducts() {
        return products.size();
    }

    // 6. Count total quantity of products in it.
    public int getTotalQuantity() {
        int totalQuantity = 0;
        for(int i = 0; i < products.size(); i++) {
            totalQuantity += products.get(i).getQuantity();
        }
        return totalQuantity;
    }

    // 7. Calculate the total price of the cart.
    public int getTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice() * products.get(i).getQuantity();
        }
        return totalPrice;
    }

    // 8. Find the specified product is in the cart or not.
    public boolean isProductPresent(Product product) {
        return products.contains(product);
    }
}
