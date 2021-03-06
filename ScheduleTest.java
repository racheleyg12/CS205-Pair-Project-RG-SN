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
   private static Professor bob;
   private static Professor jim;
   private static Professor jackie;
   private static Professor lisa;
   private static Professor jason;
   

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
      bob = new Professor("Robert Erickson","CS","Innovation E304","rerickso@uvm.edu");
      jim = new Professor("James Eddy","CS","Innovation E309","	James.Eddy@uvm.edu");
      jackie = new Professor("Jackie Horton","CS","Innovation E318","	Jackie.Horton@uvm.edu");
      lisa = new Professor("Lisa Dion","CS","Innovation E314","	Lisa.Dion@uvm.edu");
      jason = new Professor("Jason Hibbeler","CS","Innovation E315","Jason.Hibbeler@uvm.edu");
      
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
      cs110 = new Class("CS", "CS110 Intmd Programming-Java",jackie , 50, new ArrayList<Class>(), classTime3);
       
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
   
   
   //Make sure Schedule methods work except scheduleClasses()//
   @Test public void test3() {
      //Adding 3 classes using ArrayList<Class>
      ArrayList<Class> classSet = new ArrayList<Class>(); 
      classSet.add(cs201);
      classSet.add(cs120);
      classSet.add(cs021);
      //Adding 3 classes using ArrayList<Class>
      ArrayList<Classroom> roomSet = new ArrayList<Classroom>();
      roomSet.add(votey205);
      roomSet.add(votey207);
      roomSet.add(innovation204);
      
      //To test methods
      Schedule schedule = new Schedule(classSet, roomSet);
      
      //Check getProfessors()
      //Professors should be cs201-jason, cs120-lisa, cs021-jim
      ArrayList<Professor> profs = new ArrayList<Professor>();
      profs.add(jason);
      profs.add(lisa);
      profs.add(jim);
      Assert.assertEquals(schedule.getProfessors(), profs);
      //Check the correct amount
      Assert.assertEquals(schedule.getProfessors().size(), 3);
      
      //Check findClass(String name)
      Assert.assertTrue(schedule.findClass("CS021 Cmptr Programming I"));
      // Find class not in schedule
      Assert.assertFalse(schedule.findClass("Intro to Psychology"));

      
      //Check findClassroom(String name)
      // Find classroom not in schedule
      Assert.assertFalse(schedule.findClassroom("Kalkin 325"));
      // Find classroom in schedule
      Assert.assertFalse(schedule.findClassroom("Votey 207"));
      
      //Check findProfessor(String name)
      Assert.assertTrue(schedule.findProfessor("James Eddy"));
      // Find Professor not in schedule
      Assert.assertFalse(schedule.findProfessor("Heather"));   
   }
      
   //Make sure Schedule scheduleClasses() work//
   @Test public void test4() {
      //Adding 5 classes using ArrayList<Class>
      ArrayList<Class> classSet = new ArrayList<Class>(); 
      classSet.add(cs008);
      classSet.add(cs021);
      classSet.add(cs110);
      classSet.add(cs120);
      classSet.add(cs201);
      classSet.add(cs205);
      
      //Adding 4 classes using ArrayList<Class>
      ArrayList<Classroom> roomSet = new ArrayList<Classroom>();
      roomSet.add(votey205);
      roomSet.add(votey207);
      roomSet.add(votey209);
      roomSet.add(innovation204);
      
      //To test scheduleClasses()
      Schedule schedule = new Schedule(classSet, roomSet);
      schedule.scheduleClasses();
      
      //Checks avability
      //votey205 should NOT be availble
      Assert.assertFalse(votey205.getAvailability());
      
      //votey207 should NOT be availble
      Assert.assertFalse(votey207.getAvailability());
      
      //votey209 should NOT be availble
      Assert.assertFalse(votey209.getAvailability());
      
      //innovation204 should be availble
      Assert.assertTrue(innovation204.getAvailability());
      
      //Check classes scheduled in votey205
      ArrayList<Class> classScheduled = new ArrayList<Class>();
      classScheduled.add(cs008);
      classScheduled.add(cs201);
      classScheduled.add(cs021);
      Assert.assertEquals(votey205.getClasses(), classScheduled); 
      
      //Times should not overlap in votey205
      System.out.printf("\n");
      System.out.println("No two class times in any classroom should overlap:");
      System.out.printf("The classes in Votey 205: \n");
      for(Class c :  votey205.getClasses()){
         System.out.printf("%-30s [%5.2f %5.2f] \n", c.getName(), c.getTime()[0], c.getTime()[1]);
      }
      
      //Capacities should checkout
      System.out.printf("\n");
      System.out.printf("The capacity of Votey 205: " + votey205.getCapacity() + "\n");
      System.out.printf("The capacity of Classes in Votey 205: \n");
      for(Class c :  votey205.getClasses()){
         System.out.printf("%-30s %2d \n", c.getName(), c.getCapacity());
      }

   }
   
   //Make sure classes & classroom are add correctly after initialization  by ArrayList option//
   @Test public void test5() {
      //Adding two classes using ArrayList<Class>
      ArrayList<Class> classSet = new ArrayList<Class>(); 
      classSet.add(cs110);
      classSet.add(cs120);
      
      //Adding two classes using ArrayList<Class>
      ArrayList<Classroom> roomSet = new ArrayList<Classroom>();
      roomSet.add(votey205);
      roomSet.add(votey207);

      //To test arguments
      Schedule schedule = new Schedule(classSet, roomSet);
      
      //Adding more classes
      schedule.addClass(cs201);
      schedule.addClass(cs205);
       
      //Adding more classrooms
      schedule.addClassroom(votey207);
      schedule.addClassroom(innovation204);
      
      //Check the correct number of classes added
      Assert.assertEquals(schedule.getClasses().size(), 4);
      
      //Check classes added
      Assert.assertNotNull(schedule.getClasses()); 
      
      //Check the correct number of classrooms added
      Assert.assertEquals(schedule.getClassrooms().size(), 4);
      
      //Check classrooms added
      Assert.assertNotNull(schedule.getClassrooms());
      
      //Check all classrooms are available, as nothing has been scheduled
      for(Classroom c: schedule.getClassrooms()){
         Assert.assertTrue(c.getAvailability());
      }            
   }

}

