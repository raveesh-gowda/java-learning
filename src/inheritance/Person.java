package inheritance;

public class Person {
    private final String name;
    private String email;
    private String phoneNumber;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return String.format("Person %s , Email : %s, Phone Number : %s", name, email, phoneNumber);
    }
}
