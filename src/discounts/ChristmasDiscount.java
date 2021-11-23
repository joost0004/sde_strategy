package discounts;

import com.hz.Customer;
import products.Product;

public class ChristmasDiscount implements Discount{
    @Override
    public double getDiscount(Customer customer, Product product, int index) {
        if (index == 0) {
            return 0.20;
        } else
            return 0.125;
    }
}
