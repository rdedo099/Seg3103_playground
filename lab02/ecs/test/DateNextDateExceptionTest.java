import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runner.Result;


@RunWith (Parameterized.class)
public class DateNextDateExceptionTest
{
private Date d;

public DateNextDateExceptionTest (Date d, Date expectedResult)
 {
  super();
  this.d = d;
 }

@Parameterized.Parameters
 public static Collection input()
 {
  Date[] data = new Date[3];
  data[0] = new Date(1500,02,31);
  data[1] = new Date(150,02,29);
  data[2] = new Date(-1,10,20);
  
  return Arrays.asList(data);
 }

 @Test
 public void testDateNextDateExceptionTest ()
 {
   System.out.println("Testing DateNextDateOk... Test object: " + d);
   try {
     d.nextDate();
     Assert.fail();
   } catch (IllegalArgumentException ee){
     Assert.assertEquals("Exception error: IllegalArgumentException", ee.getMessage());
   }
 }
}