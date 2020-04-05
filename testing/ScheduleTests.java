import java.lang.Object;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import class Class;

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
      double[] timing;
      Professor rob = new Professor();
      Professor lisa = new Professor("Lisa", c ,"Innovation 243E", "lisa@uvm.edu");
      Professor jim = new Professor("James", c ,"Innovation E309","James.Eddy@uvm.edu");
      Professor jackie = new Professor("Jackie", c ,"Innovation E318","	Jackie.Horton@uvm.edu");
      Professor jason = new Professor("Jason", c ,"Innovation E315","Jason.Hibbeler@uvm.edu");

      schedule = new Schedule();
      votey205 = new Classroom("Votey", 207, 25, true);
      votey207 = new Classroom("Votey", 205, 25, true);


      timing[0] = 8.30;
      timing[1] = 9.20;
      cs008 = new Class(c, "Intro to Website Dev", rob, new ArrayList<Class>(), timing);

      timing[0] = 10.15;
      timing[1] = 11.20;
      cs020 = new Class(c, "Intro to Python: Green", lisa, 25, new ArrayList<Class>(), timing);


      // cs021 = ;
//       cs110 = ;
//       cs124 = ;
   }

   //@After
   public void tearDown(){

   }

   //@Tests
   public void testOne(){

   }
}