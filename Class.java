import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.ArrayList;

public class Class{
   //Fields
    String dept, name;                 //department/subject: string & name: string
    Professor prof;                    //professor: Professor
    int capactiy;                      //class capacity: int
    ArrayList<Class> preReq;           //prerequisite course(s): set <Class>
    double[] time;                     //Start time & end time
    

    //Default Constructor
    public Class(){
        dept = "CS";
        name = "CS008 Intro to Web Site Dev";
        prof = new Professor(); //Default Professor is Bob
        capactiy = 20;
        time[0] = 1;
        time[1] = 2;
    }
    
    //Constructor
    public Class(String dept, String name, Professor p, int cap, ArrayList<Class> reqs, double[] length) {
        this.dept = dept;
        this.name = name;
        prof = p;
        capactiy = cap;
        preReq = reqs;
        time = length;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public Professor getProf() {
        return prof;
    }
    public int getCapactiy() {
        return capactiy;
    }
    public ArrayList<Class> getPreReq() {
        return preReq;
    }
    public double[] getTime() {
        return time;
    }
    
    //compareTo compares the endtime
    public int compareTo(Class compareClass) {
        if (this.time[1] < compareClass.getTime()[1]){
            return -1;
        } else if (this.time[1] > compareClass.getTime()[1]){
            return 1;
        } else {
            return 0;
        }
    }
    
    //compatible method makes sure classes do not overlap 
    public boolean compatible(Class otherClass){
         if(otherClass.getTime()[0] > this.getTime()[1]){    //otherClass startime > this class's endtime
               return false;
         }
         return true;
    }

}

/*
 * Comparator interface to use Collections.sort() to sort according 
 * by finish and start time. 
 */
class sortByClass implements Comparator<Class>{
    // Used for sorting in ascending order of finish time for classes 
    public int compare(Class a, Class b) { 
        if (a.getTime()[1] < b.getTime()[1]){
            return -1;
        } else if (a.getTime()[1] > b.getTime()[1]){
            return 1;
        } else {
            return 0;
        }
     }
}