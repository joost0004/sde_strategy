package discounts;


import com.hz.Customer;
import products.Product;

public interface Discount {
    public double getDiscount(Customer customer, Product product, int index);
}
