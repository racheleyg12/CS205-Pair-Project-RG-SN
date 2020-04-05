import java.util.List;
import java.util.ArrayList;

public class Simulation {
    public static void main(String args[]) {
       //Making schedule
       Schedule schedule = new Schedule();
       
       //Adding Classes
       Professor bob = new Professor("Robert Erickson","CS","Innovation E304","rerickso@uvm.edu");
       double[] classTime1 = {9.30, 10.40};
       schedule.addClass(new Class("CS", "CS008 Intro to Web Site Dev",bob , 20, new ArrayList<Class>(), classTime1));
       
       Professor jim = new Professor("James Eddy","CS","Innovation E309","	James.Eddy@uvm.edu");
       double[] classTime2 = {13.15, 14.30};
       schedule.addClass(new Class("CS", "CS021 Cmptr Programming I:",jim , 20, new ArrayList<Class>(), classTime2));
       
       Professor jackie = new Professor("Jackie Horton","CS","Innovation E318","	Jackie.Horton@uvm.edu");
       double[] classTime3 = {14.15, 15.30};
       schedule.addClass(new Class("CS", "CS110 Intmd Programming-Java",jackie , 70, new ArrayList<Class>(), classTime3));
       
       Professor lisa = new Professor("Lisa Dion","CS","Innovation E314","	Lisa.Dion@uvm.edu");
       double[] classTime4 = {10.15, 11.05};
       schedule.addClass(new Class("CS", "CS120 Adv Programming: C++",lisa , 40, new ArrayList<Class>(), classTime4));
       
       Professor jason = new Professor("Jason Hibbeler","CS","Innovation E315","Jason.Hibbeler@uvm.edu");
       double[] classTime5 = {12, 12.50};
       schedule.addClass(new Class("CS", "CS201 Operating Systems",jason , 40, new ArrayList<Class>(), classTime5));
   
       double[] classTime6 = {10.15, 11.05};
       schedule.addClass(new Class("CS", "CS205 Software Engineering",jason , 40, new ArrayList<Class>(), classTime6));
       
       //Adding Classrooms
       schedule.addClassroom(new Classroom("Votey", 205, 50, true));
       schedule.addClassroom(new Classroom("Votey", 207, 70, true));
       schedule.addClassroom(new Classroom("Votey", 209, 70, true));
       schedule.addClassroom(new Classroom("Innovation", 204, 70, true));
       
       //Scheduling Classes in Classrooms
       schedule.scheduleClasses();
   
    }
}