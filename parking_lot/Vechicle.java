public abstract class Vechicle {

    private String registerId;
    protected ParkingTicket ticket;

    public Vechicle(String registerId) {
        this.registerId = registerId;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void assignTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }

    public String getLicenseNo() {
        return registerId;
    }
}
