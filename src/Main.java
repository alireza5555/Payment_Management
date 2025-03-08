import payment.*;

public class Main{
    public static void main(String[] args){
        PremiumCustomer reza = new PremiumCustomer("Reza");
        PremiumCustomer ali = new PremiumCustomer("Ali");
        RegularCustomer somaye = new RegularCustomer("Somaye");

        BitcoinPayment bitcoin =  new BitcoinPayment("bcQR23d");
        CreditCardPayment credit = new CreditCardPayment("5858-6822-0151-2233" , "Sara");
        PayPalPayment paypal = new PayPalPayment("aliparvin@gmail.com");



        ali.displayCustomerInfo();
        ali.showPaymnetHistory();
        ali.makePayment(bitcoin , 0.2);
        ali.makePayment(credit , 2000);
        reza.displayCustomerInfo();
        reza.showPaymnetHistory();
        reza.makePayment(credit , 20000);
        reza.makePayment(paypal , 3333);
        somaye.displayCustomerInfo();
        somaye.showPaymnetHistory();
        somaye.makePayment(bitcoin , 1);
        somaye.makePayment(bitcoin , 666);
    }
}