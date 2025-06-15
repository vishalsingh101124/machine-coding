import java.time.LocalDateTime;

public class ParkingTicket {

    private String ticketNo;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double amount;
    private Payment payment;

    public ParkingTicket(String ticketNo) {
        this.ticketNo = ticketNo;
        this.entryTime = LocalDateTime.now();
    }

    public long calculateDuration() {
        this.exitTime = LocalDateTime.now();
        return java.time.Duration.between(entryTime, exitTime).toSeconds();
    }

    public void updateStatus(Payment payment) {
        this.payment = payment;
        this.amount = payment.getAmount();
    }

    public String getTicketNo() {
        return ticketNo;
    }
}
