import java.util.Stack;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Class {
   //Fields
    String dept, name;        //department/subject: string & name: string
    Professor prof;           //professor: Professor
    int capactiy;             //class capacity: int
    ArrayList<Class> preReq;  //prerequisite course(s): set <Class>
    double[] time;            //Start time & end time
    

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

}