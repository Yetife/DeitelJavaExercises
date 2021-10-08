package schoolOOP;

public class Person {
private String name;
private String address;
private String phoneNumber;
private String emailAdress;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }

    public void name(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
