public class FamilyMember extends Person {

    //Attributes
    private String name;
    private String phone;
    private String email;
    private String relation;

    //Constructor
    public FamilyMember (String name, String phone, String email, String relation){
        super(name, phone, email);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.relation = relation;
    }

    //Name getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //Phone getter and setter
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    //Email getter and setter
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    //Relation getter and setter
    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getRelation(){
        return this.relation;
    }

    //To String metode
    @Override
    public String toString(){
        return
                ("Name: " + name + "\n" +
                 "Number: " + phone + "\n" +
                 "Email: " + email + "\n" +
                 "Relation:" + relation + "\n");
    }

}
