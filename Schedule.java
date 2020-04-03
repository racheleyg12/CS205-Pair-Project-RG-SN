/* Class Schedule
 * Main part of program will be scheduling classes in classroom
 * in class schedule
 */
import java.util.Collections
import java.io.*;
import java.util.ArrayList;

public class Schedule{
    //Fields
    ArrayList<Class> classes;          //Classes: set <Class>
    ArrayList<Classroom> classrooms;   //Classrooms: set <Classrooms>
    
    //Default Constructor
    public Schedule(){
         classes = new ArrayList<Class>();
         classroomset = new ArrayList<Classroom>();
    }
    
    //Constructor
    public Schedule(ArrayList<Class> classes, ArrayList<Classroom> classrooms){
         this.classes = classes;
         this.classrooms = classrooms;
    }

    //Methods
    //add Class
    public void addClass(Class c){
         classes.add(c);
    }
    //add Classroom
    public void addClassroom(Classroom r){
        classroomset.add(r);
    }
 
    //Getters
    public ArrayList<Class> getClasses() {
        return classes;
    }
    public ArrayList<Classroom> getClassroomset() {
        return classroomset;
    }
    public ArrayList<Professor> getProfessors() {
        ArrayList<professors> profs;
        //TODO: return profs
        //TODO: return none if there are to classes
        return profs;
    }


    
    //Find Class
    public boolean findClass(String name){ 
        for (Class c : classes) {
            if(c.name == name){ 
                return true;
            } 
        }
        return false;
    }
    //Find Classroom
    public boolean findClassroom(String name){ 
        for (Classroom cr : classrooms) {
            if(cr.name == name){ // checking by name (building + room)
                return true;
            } 
        }
        return false;
    }
    //Find Professor
    public boolean findProfessor(String name){ 
        for (Class c : classes){
            if (c.getProf().getName() == name){
               return true;        // if professor is in one of the classes in the schedule return false
            }
        }
        return false;              // if no professors match return false
     }

    //Schedule classes base on their time & availability of classrooms
    //Optimally schedule classes - using least amount of classrooms
    //Returns Optimally schedule of all classes & classrooms in the object
    public ArrayList<String> scheduleClasses(){ 
        //TODO: ACTUALLY IMPLEMENT
        //TODO: CASE IF THERE IS NOT ENOUGH CLASSROOMS FOR CLASSES
        //TODO: CASE IF THERE IS NO CLASSES
        list<string> sched = new list<string>;
        return sched;
    }

    //Gets all classes occurring in classroom
    ArrayList<Class> getClassesInClassroom(Classroom r){ 
        //TODO: ACTUALLY IMPLEMENT
        //TODO: CASE IF CLASSROOM DOES NOT EXIST
        //TODO: CASE IF THERE ARE NO CLASSES IN CLASSROOM
        ArrayList<Class> inRoom = new list<Class>();
        return inRoom;
    }


}