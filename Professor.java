public class Professor{
    //Fields
    String name;     //name: string
    String dept;     //department/subject: string
    String office;   //office location: string
    String email;    //email: string

    //Default Constructor
    public Professor(){
        name = "Robert Erickson";
        dept = "CS";
        office = "Innovation 304E";
        email = "rerickso@uvm.edu";
    }
    //Constructor
    public Professor(String n, String d, String o, String e){
        name = n;
        dept = d;
        office = o;
        email = e;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public String getOffice() {
        return office;
    }
    public String getEmail() {
        return email;
    }

}