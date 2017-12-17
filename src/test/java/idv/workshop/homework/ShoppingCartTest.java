package idv.workshop.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartTest {

    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;
    private Product product5;

    // 把參數替換成變數?
    @Before
    public void init() {
        product1 = new Product(Long.valueOf(001), "comic", 729, 20);
        product2 = new Product(Long.valueOf(002), "novel", 540, 10);
        product3 = new Product(Long.valueOf(003), "illustration", 2160, 1);
        product4 = new Product(Long.valueOf(004), "anthology", 2800, 1);
        product5 = new Product(Long.valueOf(005), "goods", 200, 30);
    }

    @After
    public void clear(){
        product1 = null;
        product2 = null;
        product3 = null;
        product4 = null;
        product5 = null;
    }

    @Test
    public void testShoppingCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.getNumberOfProducts());
    }

    // 1. Add product into cart.
    @Test
    public void testAddProductIntoCart() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        assertEquals(1, shoppingCart.getNumberOfProducts());
        shoppingCart.addIntoCart(product2);
        assertEquals(2, shoppingCart.getNumberOfProducts());
    }

    // 2. Remove a specified product from the cart.
    @Test
    public void testRemoveASpecifiedProduct() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        shoppingCart.addIntoCart(product2);
        shoppingCart.addIntoCart(product3);
        assertEquals(3, shoppingCart.getNumberOfProducts());

        shoppingCart.removeASpecifiedProducts(product3);
        assertEquals(2, shoppingCart.getNumberOfProducts());
    }

    // 3. Remove several products from cart.
    @Test
    public void testRemoveSpecifiedProducts() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        shoppingCart.addIntoCart(product2);
        shoppingCart.addIntoCart(product3);
        shoppingCart.addIntoCart(product4);
        shoppingCart.addIntoCart(product5);

        List<Product> removedList = new ArrayList<>();
        removedList.add(product4);
        removedList.add(product5);

        assertTrue(shoppingCart.removeProducts(removedList));
        assertEquals(3, shoppingCart.getNumberOfProducts());
    }

    // 4. Remove all products from the cart.
    @Test
    public void testRemoveAllProducts() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product3);
        shoppingCart.addIntoCart(product4);
        shoppingCart.addIntoCart(product5);

        shoppingCart.removeAll();
        assertEquals(0, shoppingCart.getNumberOfProducts());
    }

    // 5. Count how many types of products in it.
    @Test
    public void testTypes() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        shoppingCart.addIntoCart(product2);
        shoppingCart.addIntoCart(product3);
        shoppingCart.addIntoCart(product4);
        shoppingCart.addIntoCart(product5);

        assertEquals(5, shoppingCart.getNumberOfProducts());
    }

    // 6. Count total quantity of products in cart.
    // 這邊寫起來不順,應該要再修改
    @Test
    public void testTotalQuantity() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        shoppingCart.addIntoCart(product2);
        shoppingCart.addIntoCart(product4);
        shoppingCart.addIntoCart(product5);

        assertEquals(4, shoppingCart.getNumberOfProducts());
        assertEquals(61, shoppingCart.getTotalQuantity());
    }

    // 7. Calculate the total price of the cart.
    // 也要再修改
    @Test
    public void testTotalPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        shoppingCart.addIntoCart(product2);
        shoppingCart.addIntoCart(product5);

        assertEquals(3, shoppingCart.getNumberOfProducts());
        assertEquals(25980, shoppingCart.getTotalPrice());
    }

    // 8. Find the specified product is in the cart or not.
    @Test
    public void testIsProductPresent() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addIntoCart(product1);
        shoppingCart.addIntoCart(product2);
        shoppingCart.addIntoCart(product3);
        shoppingCart.addIntoCart(product4);
        shoppingCart.addIntoCart(product5);

        assertTrue(shoppingCart.isProductPresent(product1));
        assertTrue(shoppingCart.isProductPresent(product2));
        assertTrue(shoppingCart.isProductPresent(product3));
        assertTrue(shoppingCart.isProductPresent(product4));
        assertTrue(shoppingCart.isProductPresent(product5));
    }
}
