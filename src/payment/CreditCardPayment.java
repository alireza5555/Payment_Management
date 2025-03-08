package payment;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber , String cardHolderName){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println(getPaymentDetails());
        System.out.println("Amount: " + amount + "\n" + "+++++++++++++++++++++++++++++++");

    }

    @Override
    public String getPaymentDetails(){
        String information = "Payment Type:" + " Credit card" + "\n" + "Card number: " + cardNumber + "\n" + "Cardholder: " + cardHolderName ;
        return information;
    }

}
