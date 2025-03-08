package payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;
    public BitcoinPayment (String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount){
        System.out.println(getPaymentDetails());
        System.out.println("Amount: " + amount + "\n" + "+++++++++++++++++++++++++++++++");
    }

    @Override
    public String getPaymentDetails(){
        String information = "Payment Type:" + " Bitcoin" + "\n" + "Wallet Address: " + walletAddress ;
        return information;
    }

}
