package discounts;

import com.hz.Customer;
import com.hz.ShoppingCart;
import products.Product;

public class BlackFridayDiscount implements Discount{
    @Override
    public double getDiscount(Customer customer, Product product, int index) {
        ShoppingCart shoppingCart = customer.getCart();
        double cartSize = shoppingCart.size();
        if (cartSize > 80) {
            cartSize = 80;
        }
        double discount = cartSize / 100;
        return discount;
    }
}
