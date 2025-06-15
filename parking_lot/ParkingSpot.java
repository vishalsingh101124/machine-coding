public abstract class ParkingSpot {

    protected  int id;
    protected  boolean isFree;
    protected Vechicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean isFree() {
        return isFree;
    }

    public void assignVehicle(Vechicle vehicle) {
        this.vehicle = vehicle;
        this.isFree = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isFree = true;
    }
}
