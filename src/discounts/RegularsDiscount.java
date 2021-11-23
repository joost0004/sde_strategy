package discounts;

import com.hz.Customer;
import products.Product;

public class RegularsDiscount implements Discount{
    @Override
    public double getDiscount(Customer customer, Product product, int index) {
        if (customer.isRegular()) {
            return 0.15;
        } else {
            return 0;
        }
    }
}
