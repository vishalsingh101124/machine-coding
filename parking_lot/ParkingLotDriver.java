import enums.AccountStatus;

public class ParkingLotDriver {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot("Central Lot", "BTM");

        Admin admin = new Admin("admin", "admin123", AccountStatus.ACTIVE,new Person("11", "Vishal", "Bangalore"));
        admin.addParkingSpot(lot, new CarSpot(1));
        admin.addParkingSpot(lot, new CarSpot(2));

        Vechicle car = new Car("KA51MW123");

        ParkingTicket ticket = lot.getParkingTicket(car);
        System.out.println("Ticket issued: " + ticket.getTicketNo());

        // Simulate exit
        try { Thread.sleep(10000); } catch (InterruptedException e) { }

        long duration = ticket.calculateDuration();
        System.out.println("Duration: " + duration + " seconds");

        Payment payment = new CashPayment(duration * 2); // ₹2/sec
        payment.initiateTransaction();

        ticket.updateStatus(payment);
    }
}
