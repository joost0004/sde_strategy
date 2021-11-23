package com.hz;

import discounts.BlackFridayDiscount;
import discounts.ChristmasDiscount;
import discounts.Discount;
import discounts.RegularsDiscount;
import products.Product;

public class DiscountCalculator {

    private Customer customer;

    private Discount currentDiscount;

    public DiscountCalculator(Customer customer, SalesAction salesAction) {
        this.customer = customer;
        switch (salesAction) {
            case ChristmasEve:
                this.currentDiscount = new ChristmasDiscount();
                break;
            case BlackFriday:
                this.currentDiscount = new BlackFridayDiscount();
                break;
            default:
                this.currentDiscount = new RegularsDiscount();
                break;
        }
    }

    public double getDiscount(Product product, int index) {
        double discount = this.currentDiscount.getDiscount(this.customer, product, index);
        Console.write(discount);
        return 1 - discount;

    }
}
