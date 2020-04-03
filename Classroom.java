import java.util.ArrayList;
public class Classroom {
   //Fields
   String building;           //building: string
   int roomNum;               //room number: string (ie. E204)
   String name;               //name: string (building + room number)
   int capcity;               //class capacity: int
   double[] availability;     //availability: double[] //An array/list/or vector of time slots
   ArrayList<Class> classes;  //Classes held in classroom
   
   //Default Constructor
      public Classroom(){
      building = "Innovation";
      roomNum = 204;
      name = "Innovation" + 204;
      capcity = 50;
      availability = new double[9]; //9 hours
   }
   
   //Constructor
   public Classroom(String building, int room, int cap, double[] avail){
      this.building = building;
      roomNum = room;
      name = building + " " + room;
      capcity = cap;
      availability = avail;
   }
   //Setter - for setting correctly SCHEDULED classes in a classroom
   public void setClasses(ArrayList<Class> classes){
      this.classes = classes;
   }
   
   //Getters
   public String getBuilding() {
        return this.building;
   }
   public int getRoomNum() {
        return this.roomNum;
   }
   public String getName() {
        return this.name;
   }
   public int getCapcity() {
        return this.capcity;
   }
   public double[] getAvailability() {
        return this.availability;
   }
   public ArrayList<Class> getClasses(){
      return this.classes;
   }

}