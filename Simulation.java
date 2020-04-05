import java.util.List;
import java.util.ArrayList;

public class Simulation {
  public Simulation(Schedule schedule) {  
    //Adding Classes
    Professor bob = new Professor("Robert Erickson","CS","Innovation E304","rerickso@uvm.edu");
    double[] classTime = {9.5, 10.5};
    schedule.addClass(new Class("CS", "CS008 Intro to Web Site Dev",bob , 20, new ArrayList<Class>(), classTime));
    
    Professor jim = new Professor("James Eddy","CS","Innovation E309","	James.Eddy@uvm.edu");
    classTime[0] = 13.25;
    classTime[1] =14.5;
    schedule.addClass(new Class("CS", "CS021 Cmptr Programming I:",jim , 20, new ArrayList<Class>(), classTime));
    
    Professor jackie = new Professor("Jackie Horton","CS","Innovation E318","	Jackie.Horton@uvm.edu");
    classTime[0] = 14.25;
    classTime[1] = 15.5;
    schedule.addClass(new Class("CS", "CS110 Intmd Programming-Java",jackie , 70, new ArrayList<Class>(), classTime));
    
    Professor lisa = new Professor("Lisa Dion","CS","Innovation E314","	Lisa.Dion@uvm.edu");
    classTime[0] = 10.25;
    classTime[1] = 11.25;
    schedule.addClass(new Class("CS", "CS120 Adv Programming: C++",lisa , 40, new ArrayList<Class>(), classTime));
    
    Professor jason = new Professor("Jason Hibbeler","CS","Innovation E315","Jason.Hibbeler@uvm.edu");
    classTime[0] = 12;
    classTime[1] = 13;
    schedule.addClass(new Class("CS", "CS201 Operating Systems",jason , 40, new ArrayList<Class>(), classTime));

    classTime[0] = 10.25;
    classTime[1] = 11.25;
    schedule.addClass(new Class("CS", "CS205 Software Engineering",jason , 40, new ArrayList<Class>(), classTime));
    
    //Adding Classrooms
    schedule.addClassroom(new Classroom("Votey", 205, 50, true));
    schedule.addClassroom(new Classroom("Votey", 207, 70, true));
   
   }

   public static void main(String[] args) throws IOException { // main method to run simulation


  }



  }