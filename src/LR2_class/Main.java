package LR2_class;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setIndex(65000);
        address.setStreet("Ekaterininskaya 27");

        Contact contact = new Contact("Olya", 0631234567, address);
        contact.setName("Olya2");
        contact.setPhoneNumber(06312345667);

        contact.getAddress().setStreet("fgdg");


        contact.setAddress(address);
    }
}
