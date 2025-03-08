package payment;

public class PayPalPayment implements PaymentStrategy {
    String email;
    public  PayPalPayment (String email){
        this.email = email;
    }

    @Override
    public void pay(double amount){
        System.out.println(getPaymentDetails());
        System.out.println("Amount: " + amount + "\n" + "+++++++++++++++++++++++++++++++");

    }

    @Override
    public String getPaymentDetails(){
        String information = "Payment Type: " + "Paypal" + "\n" + "Email: " + email ;
        return information;
    }
}
