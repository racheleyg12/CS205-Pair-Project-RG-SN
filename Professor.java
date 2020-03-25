
public class Professor{
    //—————Fields—————
    //      name: string
    String name;
    //      department/subject: string
    String dept;
    //      office location: string
    String office;
    //      email: string
    String email;
    //      —————Methods—————

   //Constructor
    public Professor(){
        name = "Jesse Doe";
        dept = 'English';
        office = '123 Marsh Life';
        email = 'jdoe@email.com';
    }
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