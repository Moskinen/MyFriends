public class Friend extends Person {
    //Attributes
    String name;
    String phone;
    String email;

    // Constructor
    public Friend(String name, String phone, String email) {
        super(name, phone, email);
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getEmail(){
        return this.email;
    }
}
