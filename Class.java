import java.util.Stack;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Class {
//    department/subject: string
//    name: string
    String dept, name;
//    professor: Professor
    Professor prof;
//    class capacity: int
    int capactiy;
//    prerequisite course(s): set <Class>
    set<Class> preReq;
//    time: double[] //Start time & end time
    double[] time;

    //Constructor
    public Class(){
        dept = "";
        name = "";
        prof = new Professor();
        capactiy = 20;
        time[0] = 1;
        time[1] = 2;
    }

    public Class(String dept, String name, Professor p, int cap, set<Class> reqs, double[] length) {
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
    public set<Class> getPreReq() {
        return preReq;
    }
    public double[] getTime() {
        return time;
    }

}