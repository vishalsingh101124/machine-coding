import enums.AccountStatus;

public class Admin  extends Account{
    public Admin(String userName, String password, AccountStatus status, Person person) {
        super(userName, password, status, person);
    }

    public boolean addParkingSpot(ParkingLot lot, ParkingSpot spot) {
        return lot.addParkingSpot(spot);
    }
}
