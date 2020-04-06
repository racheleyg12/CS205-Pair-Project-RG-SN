import java.lang.Object;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;

import java.util.List;
import java.util.ArrayList;

public class ScheduleTests{
   private static Schedule schedule;
   private static Classroom votey207;
   private static Classroom votey205;
   private static Classroom kalkin103;
   private static Classroom kalkin325;
   private static Class cs008;
   private static Class cs020;
   private static Class cs021;
   private static Class cs110;
   private static Class cs124;
   private static Class stat095;
   private static Class stat141;

   //@BeforeClass
   public static void setUp(){ //init everything
      String c = "CS";
      double[] timing = {0, 0};
      ArrayList<Class> reqCS = new ArrayList<Class>();
      ArrayList<Class> reqSTAT = new ArrayList<Class>();
      //schedule = new Schedule();
      // All Professors
      Professor rob = new Professor();
      Professor lisa = new Professor("Lisa", c ,"Innovation 243E", "lisa@uvm.edu");
      Professor jim = new Professor("James", c ,"Innovation 309E","James.Eddy@uvm.edu"); // for testing not in base
      Professor jackie = new Professor("Jackie", c ,"Innovation 318E","	Jackie.Horton@uvm.edu");
      Professor jason = new Professor("Jason", c ,"Innovation 315E","Jason.Hibbeler@uvm.edu");
      Professor meg = new Professor("Meghan", "STAT", "Kalkin 225", "meg@hotmail.com");
      // All ClassRooms
      votey205 = new Classroom("Votey", 207, 25, true);
      votey207 = new Classroom("Votey", 205, 25, true);
      kalkin325 = new Classroom("Kalkin", 325, 30, true);
      kalkin103 = new Classroom("Kalkin", 103, 50, false);

      // Classes
      timing[0] = 8.30;
      timing[1] = 9.20;
      cs008 = new Class(c, "Intro to Website Dev", rob, 30, new ArrayList<Class>(), timing);

      timing[0] = 10.15;
      timing[1] = 11.20;
      cs020 = new Class(c, "Intro to Python: Green", lisa, 40, new ArrayList<Class>(), timing);

      timing[0] = 9.40;
      timing[1] = 10.30;
      cs021 = new Class(c, "Intro to Python: Gold", jackie, 45, new ArrayList<Class>(), timing);
      reqCS.add(cs021);

      timing[0] = 13.15;
      timing[1] = 14.30;
      cs110 = new Class(c, "Intermed Java Programming", lisa, 25, req, timing);

      timing[0] = 15.30;
      timing[1] = 16.20;
      cs124 = new Class(c, "Pre-C++ Programming", jason, 35, req, timing);

      //Dummy classes
      timing[0] = 10.50;
      timing[1] = 11.40;
      stat095 = new Class("STAT", "Intro to Stats", meg, 40, new ArrayList<Class>(), timing);
      reqSTAT.add(stat095);

      timing[0] = 15.30;
      timing[1] = 16.20;
      stat141 = new Class("STAT", "Advanced Stat Methods", jim, 35, req, timing);
   }

   //@After
   public void tearDown(){// Ending: Jason's library has list of checkouts

   }

   //@Tests
   public void testOne(){
      // 1st schedule
      Schedule schedule1 = new Schedule();
      // Adding classrooms
      schedule1.addClassroom(votey207);
      schedule1.addClassroom(votey205);
      schedule1.addClassroom(kalkin325);
      // Check number of Professors before adding classes
      ArrayList<Professor> professors = schedule1.getProfessors();
      Assert.assertEquals(professors.size(), 0);
      // Adding Classes
      schedule.addClass(cs008);
      schedule.addClass(cs021);
      schedule.addClass(stat095);
      // Total number of professors after adding classes
      ArrayList<Professor> professors = schedule.getProfessors();
      Assert.assertEquals(professors.size(), 2);

      schedule1.scheduleClasses();
   }

   public void testTwo(){
      Array<Class> classSet2 = new Array<Class>();
      classSet2.add(cs110);
      classSet2.add(cs124);
      classSet2.ads(cs008);
      classSet2.ads(stat095);
      Array<Classroom> roomSet2 = new Array<Classroom>();
      roomSet2.add(kalkin103);
      roomSet2.add(votey207);
      roomSet2.add(kalkin325);
      // 2nd schedule made with arguments
      Schedule schedule2 = new Schedule(classSet2, roomSet2);
      // Find professor not in schedule
      boolean f1 = schedule2.findProfessor("Heather");
      Assert.assertFalse(f1);
      // Find class not in schedule
      boolean f2 = schedule2.findClass("Intro to Psychology");
      Assert.assertFalse(f1);
      // Find class in schedule
      boolean f3 = schedule2.findClass("Intro to Stat");
      Assert.assertTrue(f1);
      // Find classroom not in schedule
      boolean f4 = schedule2.findClassroom("Innovation 204");
      Assert.assert(f4);






   }


}