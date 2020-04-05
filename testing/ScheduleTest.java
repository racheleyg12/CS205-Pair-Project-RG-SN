import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {
   private static Schedule schedule;
   private static Classroom votey207;
   private static Classroom votey205;
   private static Class cs008;
   private static Class cs020;
   private static Class cs021;
   private static Class cs110;
   private static Class cs124;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
}
