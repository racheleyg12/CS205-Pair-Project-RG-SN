import java.util.List;
import java.util.ArrayList;

public class Simulation {
  public Simulation(Schedule schedule) {
        
   
    Professor bob = new Professor("Robert Erickson","CS","Innovation 304E","rerickso@uvm.edu");
    double[] classTime = {9.5, 10.5};
    schedule.addClass(new Class("CS", "CS008 Intro to Web Site Dev",bob , 20, new ArrayList<Class>(), classTime));
    
  
   }
}