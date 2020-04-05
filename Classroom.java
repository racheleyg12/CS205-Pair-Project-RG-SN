import java.util.ArrayList;
public class Classroom {
   //Fields
   String building;           //building: string
   int roomNum;               //room number: string (ie. E204)
   String name;               //name: string (building + room number)
   int capcity;               //class capacity: int
   boolean available;         //available if classes have been scheduled in classroom
   ArrayList<Class> classes;  //Classes held in classroom
   
   //Default Constructor
   public Classroom(){
      building = "Innovation";
      roomNum = 204;
      name = "Innovation" + 204;
      capcity = 50;
      available = false;
   }
   
   //Constructor
   public Classroom(String building, int room, int cap, boolean avail){
      this.building = building;
      roomNum = room;
      name = building + " " + room;
      capcity = cap;
      available = avail;
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
   public boolean getAvailability() {
        return this.available;
   }
   public ArrayList<Class> getClasses(){
      return this.classes;
   }

}