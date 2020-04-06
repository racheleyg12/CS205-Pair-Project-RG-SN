import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import java.util.List;
import java.util.ArrayList;

public class ScheduleTest {
   private static Schedule schedule;
   private static Classroom votey207;
   private static Classroom votey205;
   private static Classroom votey209;
   private static Classroom innovation204;
   private static Class cs008;
   private static Class cs021;
   private static Class cs110;
   private static Class cs120;
   private static Class cs201;
   private static Class cs205;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      //Initializing schedule
      schedule = new Schedule();
      
      //Making Classrooms
      votey207 = new Classroom("Votey", 207, 50, true);
      votey205 = new Classroom("Votey", 205, 50, true);
      votey209 = new Classroom("Votey", 209, 50, true);
      innovation204 = new Classroom("Innovation", 204, 50, true);
      
      //Making Professors
      Professor bob = new Professor("Robert Erickson","CS","Innovation E304","rerickso@uvm.edu");
      Professor jim = new Professor("James Eddy","CS","Innovation E309","	James.Eddy@uvm.edu");
      Professor jackie = new Professor("Jackie Horton","CS","Innovation E318","	Jackie.Horton@uvm.edu");
      Professor lisa = new Professor("Lisa Dion","CS","Innovation E314","	Lisa.Dion@uvm.edu");
      Professor jason = new Professor("Jason Hibbeler","CS","Innovation E315","Jason.Hibbeler@uvm.edu");
      
      //prereq do not require a time
      double[] prereqTime = {0, 0};
       
      //Making Classes
      double[] classTime1 = {9.30, 10.40};
      cs008 = new Class("CS", "CS008 Intro to Web Site Dev",bob , 20, new ArrayList<Class>(), classTime1);
       
      double[] classTime2 = {13.15, 14.30};
      cs021 = new Class("CS", "CS021 Cmptr Programming I",jim , 20, new ArrayList<Class>(), classTime2);
       
      double[] classTime3 = {14.15, 15.30};
      ArrayList<Class> prereq = new ArrayList<Class>();
      prereq.add(new Class("CS", "CS021 Cmptr Programming I:",jim , 20, new ArrayList<Class>(), prereqTime));
      cs110 = new Class("CS", "CS110 Intmd Programming-Java",jackie , 70, new ArrayList<Class>(), classTime3);
       
      prereq = new ArrayList<Class>();
      prereq.add(new Class("CS", "CS124 Data Struc & Algorithms ",lisa , 20, new ArrayList<Class>(), prereqTime));
      double[] classTime4 = {10.15, 11.05}; 
      cs120 = new Class("CS", "CS120 Adv Programming: C++",lisa , 40, new ArrayList<Class>(), classTime4);
       
      double[] classTime5 = {12, 12.50};
      prereq = new ArrayList<Class>();
      prereq.add(new Class("CS", "CS120 Adv Programming: C++",lisa , 40, new ArrayList<Class>(), prereqTime));
      prereq.add(new Class("CS", "CS120 Computer Organization",jim , 40, new ArrayList<Class>(), prereqTime));
      cs201 = new Class("CS", "CS201 Operating Systems",jason , 40, new ArrayList<Class>(), classTime5);
   
      double[] classTime6 = {10.15, 11.05};
      prereq = new ArrayList<Class>();
      prereq.add(new Class("CS", "CS120 Adv Programming: C++",lisa , 40, new ArrayList<Class>(), prereqTime));
      cs205 = new Class("CS", "CS205 Software Engineering",jason , 40, new ArrayList<Class>(), classTime6);      
   }


   //Make sure classes & classroom are added correctly//
   @Test public void test1() {
      //Adding two classrooms
      schedule.addClassroom(votey207);
      schedule.addClassroom(votey205);
      
      //Adding four classes
      schedule.addClass(cs008);
      schedule.addClass(cs021);
      schedule.addClass(cs110);
      schedule.addClass(cs120);
      
      //Check the correct number of classes added
      Assert.assertEquals(schedule.getClasses().size(), 4);
      
      //Check classes added
      Assert.assertNotNull(schedule.getClasses()); 
      
      //Check the correct number of classrooms added
      Assert.assertEquals(schedule.getClassrooms().size(), 2);
      
      //Check classrooms added
      Assert.assertNotNull(schedule.getClassrooms());
      
      //Check all classrooms are available, as nothing has been scheduled
      for(Classroom c: schedule.getClassrooms()){
         Assert.assertTrue(c.getAvailability());
      }   
   }
   
   //Make sure classes & classroom are initialized correctly by ArrayList option//
   @Test public void test2() {
      //Adding 3 classes using ArrayList<Class>
      ArrayList<Class> classSet = new ArrayList<Class>(); 
      classSet.add(cs110);
      classSet.add(cs120);
      classSet.add(cs008);
      //Adding 3 classes using ArrayList<Class>
      ArrayList<Classroom> roomSet = new ArrayList<Classroom>();
      roomSet.add(votey205);
      roomSet.add(votey207);
      roomSet.add(votey209);

      //To test arguments
      Schedule schedule = new Schedule(classSet, roomSet);
      
      //Test adding classSet works
      Assert.assertEquals(classSet, schedule.getClasses());
      
      //Test adding roomSet works
      Assert.assertEquals(roomSet, schedule.getClassrooms());      
   }
   
   //Make sure //
   @Test public void test3() { // after first two tests
      //To test finds

      // Find Professor not in schedule
      boolean f1 = schedule.findProfessor("Heather");
      Assert.assertFalse(f1);
      // Find class not in schedule
      boolean f2 = schedule.findClass("Intro to Psychology");
      Assert.assertFalse(f2);
      // Find class in schedule
      boolean f3 = schedule.findClass("Intro to Stat");
      Assert.assertTrue(f3);
      // Find classroom not in schedule
      boolean f4 = schedule.findClassroom("Innovation 204");
      Assert.assertFalse(f4);
      
   }

}

