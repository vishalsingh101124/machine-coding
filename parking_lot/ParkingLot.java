import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {

    private String name;
    private String address;
    private List<ParkingSpot> spots = new ArrayList<>();

    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public boolean addParkingSpot(ParkingSpot spot) {
        return spots.add(spot);
    }

    public ParkingTicket getParkingTicket(Vechicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.isFree()) {
                spot.assignVehicle(vehicle);
                ParkingTicket ticket = new ParkingTicket(UUID.randomUUID().toString());
                vehicle.assignTicket(ticket);
                return ticket;
            }
        }
        return null;
    }

    public boolean isFull() {
        return spots.stream().noneMatch(ParkingSpot::isFree);
    }
}
