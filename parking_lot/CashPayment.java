import enums.PaymentStatus;

import java.time.LocalDateTime;

public class CashPayment  extends Payment{

    public CashPayment(double amount) {
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }
    @Override
    public void initiateTransaction() {
        System.out.println("Cash payment of ₹" + amount);
        this.status = PaymentStatus.SUCCESS;
    }
}
