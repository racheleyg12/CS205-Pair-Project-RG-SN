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
   private static Class cs008;
   private static Class cs020;
   private static Class cs021;
   private static Class cs110;
   private static Class cs124;

   //@BeforeClass
   public static void setUp(){ //init everything
      String c = "CS";
      double[] timing = {0, 0};
      ArrayList<Class> reqCS = new ArrayList<Class>();
      ArrayList<Class> reqSTAT = new ArrayList<Class>();
      schedule = new Schedule();
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
      schedule.addClassroom(votey207);
      schedule.addClassroom(votey205);
      schedule.addClassroom(kalkin325);

      schedule.addClass(cs008);
      schedule.addClass(cs021);
      schedule.addClass(stat095);

      Asert.ass
   }


}