package basics;

public class Customer {
    //state
    private final String name;
    private Address homeAddress;
    private Address workAddress;

    //creation
    //workAddress not mandatory for creation
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    //behaviors
    //certain components of homeAddress and workAddress can be modified, not the name
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("basics.Customer [%s] lives at [%s], works at [%s]",
                name,
                homeAddress,
                workAddress);
    }
}
