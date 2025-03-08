package payment;

import java.util.ArrayList;

public class RegularCustomer extends Customer {
    public RegularCustomer (String name){
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer name: " + name + "\n" + "Customer Type: " + "Regular" );
    }
}
