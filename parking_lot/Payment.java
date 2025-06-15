import enums.PaymentStatus;

import java.time.LocalDateTime;

public abstract class Payment {
    protected double amount;
    protected PaymentStatus status;
    protected LocalDateTime timestamp;

    public abstract void initiateTransaction();

    public double getAmount() {
        return amount;
    }
}
