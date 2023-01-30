package basics;

public class Address {
    //state
    private final String doorNo;
    private final String streetInfo;
    private final String city;
    private final String zipCode;

    //creation
    public Address(String doorNo, String streetInfo, String city, String zipCode) {
        super();
        this.doorNo = doorNo;
        this.streetInfo = streetInfo;
        this.city = city;
        this.zipCode = zipCode;
    }

    //behaviors
    public String toString() {
        return doorNo + ", " + streetInfo + ", " + city + " - " + zipCode;
    }
}
