package LR2_class;

public class Contact {


    public Contact(String name, int phoneNumber, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    // можно создавать любой контакт с помощью строки 12. это конструктор по умолчанию
    public Contact(String olya, int phoneNumber, String test_address){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //public писать не обязательно. ? by default
    String name;
    int phoneNumber;
    Address address;
}
