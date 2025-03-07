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

    //Getters
    public String getName() {
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getEmail(){
        return this.email;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //toString
    public String toString(){
        return "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email;
    }
}
