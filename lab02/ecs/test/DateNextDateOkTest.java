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
public class DateNextDateOkTest
{
private Date d;
private Date expectedResult;

public DateNextDateOkTest (Date d, Date expectedResult)
 {
  super();
  this.d = d;
  this.expectedResult = expectedResult;
 }

@Parameterized.Parameters
 public static Collection input()
 {
  Date[][] data = new Date[15][2];
  data[0][0] = new Date(1700,06,20);
  data[0][1] = new Date(1700,06,21);
  data[1][0] = new Date(2005,04,15);
  data[1][1] = new Date(2005,04,16);
  data[2][0] = new Date(1901,07,20);
  data[2][1] = new Date(1901,07,21);
  data[3][0] = new Date(3456,03,27);
  data[3][1] = new Date(3456,03,28);
  data[4][0] = new Date(1500,02,17);
  data[4][1] = new Date(1500,02,18);
  data[5][0] = new Date(1700,06,29);
  data[5][1] = new Date(1700,06,30);
  data[6][0] = new Date(1800,11,29);
  data[6][1] = new Date(1800,11,30);
  data[7][0] = new Date(3453,01,29);
  data[7][1] = new Date(3453,01,30);
  data[8][0] = new Date(444,02,29);
  data[8][1] = new Date(444,03,01);
  data[9][0] = new Date(2005,04,30);
  data[9][1] = new Date(2005,05,01);
  data[10][0] = new Date(3453,01,30);
  data[10][1] = new Date(3453,01,31);
  data[11][0] = new Date(3456,03,30);
  data[11][1] = new Date(3456,03,31);
  data[12][0] = new Date(1901,07,31);
  data[12][1] = new Date(1901,8,01);
  data[13][0] = new Date(3453,01,31);
  data[13][1] = new Date(3453,02,01);
  data[14][0] = new Date(3456,12,31);
  data[14][1] = new Date(3457,01,01);
  return Arrays.asList(data);
 }

 @Test
 public void testDateNextDateOkTest ()
 {
   System.out.println("Testing DateNextDateOk... Test object: " + d +" Expected Result for test: " + expectedResult);
  Assert.assertEquals(expectedResult, d.nextDate());
 }
}