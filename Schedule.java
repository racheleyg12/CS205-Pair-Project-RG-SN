/* Class Schedule
 * Main part of program will be scheduling classes in classroom
 * in class schedule
 */
import java.util.Collections;
import java.io.*;
import java.util.ArrayList;

public class Schedule{
    //Fields
    ArrayList<Class> classes;          //Classes: set <Class>
    ArrayList<Classroom> classrooms;   //Classrooms: set <Classrooms>
    
    //Default Constructor
    public Schedule(){
         classes = new ArrayList<Class>();
         classrooms = new ArrayList<Classroom>();
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
        classrooms.add(r);
    }
 
    //Getters
    public ArrayList<Class> getClasses() {
        return classes;
    }
    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }
    public ArrayList<Professor> getProfessors() {
        ArrayList<Professor> profs = new ArrayList<Professor>();
        if (classes != null){
            for(Class c : classes){
               profs.add(c.getProf());
            }
        }
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
    public void scheduleClasses(){ 
        //TODO: ACTUALLY IMPLEMENT
        //TODO: CASE IF THERE IS NOT ENOUGH CLASSROOMS FOR CLASSES
        //TODO: CASE IF THERE IS NO CLASSES
        
        //Copy of all classes in Schedule
        ArrayList<Class> classesCopy = this.classes;  
        
        //To keep track of classrooms filled
        int indexClassrooms = 0;      
        
        //DO WHILE THERE IS NO CLASSES LEFT
        while(!classesCopy.isEmpty()){
            //Sort by finish time
            Collections.sort(classes, new sortByClass());
           
            //ArrayList of jobs selected--compatible with each other
            ArrayList<Class> selected = new ArrayList<Class>();
           
            //Put the first class in selected
            selected.removeAll(selected);
            selected.add(classes.get(0));
           
            //Find a set of compatible/non-overlapping classes
            for (int i=1; i<classes.size(); i++){      //Start at one since the first class has been selected
                for(int j=0; j<selected.size(); j++){ //Make sure job is compatible w/ all jobs selected
                     if (classes.get(i).compatible(selected.get(j))){
                         selected.add(classes.get(i));
                    }
                }
            }
           
            //Delete selected classes
            for (Class c: selected){
                classes.remove(c);
            }
            
            //Increments the number of classrooms/ moves to scheduling the next set of classe for the next classroom
            if(indexClassrooms++ <= classrooms.size()){
                 //Makes classroom no longer available
                 this.classrooms.get(indexClassrooms).setAvailability(false);
                  
                 //Put selected classes into a classroom
                 this.classrooms.get(indexClassrooms).setClasses(selected);
                 indexClassrooms++;
               
            }
        }
        
    }

}