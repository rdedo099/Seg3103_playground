import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class DateTest {
//explicit testing
  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }
  @Test
  void nextDateExplicit_test1() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }
  @Test
  void nextDateExplicit_test2() {
    Date d = new Date(2005,04,15);
    assertEquals(new Date(2005,04,16), d.nextDate());
  }
  @Test
  void nextDateExplicit_test3() {
    Date d = new Date(1901,07,20);
    assertEquals(new Date(1901,07,21), d.nextDate());
  }
  @Test
  void nextDateExplicit_test4() {
    Date d = new Date(3456,03,27);
    assertEquals(new Date(3456,03,28), d.nextDate());
  }
  @Test
  void nextDateExplicit_test5() {
    Date d = new Date(1500,02,17);
    assertEquals(new Date(1500,02,18), d.nextDate());
  }
  @Test
  void nextDateExplicit_test6() {
    Date d = new Date(1700,06,29);
    assertEquals(new Date(1700,06,30), d.nextDate());
  }
  @Test
  void nextDateExplicit_test7() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }
   @Test
  void nextDateExplicit_test8() {
    Date d = new Date(3453,01,29);
    assertEquals(new Date(3453,01,30), d.nextDate());
  }
  @Test
  void nextDateExplicit_test9() {
    Date d = new Date(444,02,29);
    assertEquals(new Date(444,03,01), d.nextDate());
  }
  @Test
  void nextDateExplicit_test10() {
    Date d = new Date(2005,04,30);
    assertEquals(new Date(2005,05,01), d.nextDate());
  }
  @Test
  void nextDateExplicit_test11() {
    Date d = new Date(3453,01,30);
    assertEquals(new Date(3453,01,31), d.nextDate());
  }
  @Test
  void nextDateExplicit_test12() {
    Date d = new Date(3456,03,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }
  @Test
  void nextDateExplicit_test13() {
    Date d = new Date(1901,07,31);
    assertEquals(new Date(1901,8,01), d.nextDate());
  }
  @Test
  void nextDateExplicit_test14() {
    Date d = new Date(3453,01,31);
    assertEquals(new Date(3453,02,01), d.nextDate());
  }
  @Test
  void nextDateExplicit_test15() {
    Date d = new Date(3456,12,31);
    assertEquals(new Date(3457,01,01), d.nextDate());
  }
    @Test
  void nextDateExplicit_test16() {
    Date d = new Date(1500,02,31);
    try {
     d.nextDate();
     Assert.fail();
   } catch (IllegalArgumentException ee){
     Assert.assertEquals("Exception error: IllegalArgumentException", ee.getMessage());
   }
  }
    @Test
  void nextDateExplicit_test17() {
    Date d = new Date(1500,02,29);
    try {
     d.nextDate();
     Assert.fail();
   } catch (IllegalArgumentException ee){
     Assert.assertEquals("Exception error: IllegalArgumentException", ee.getMessage());
   }
  }
    @Test
  void nextDateExplicit_test18() {
    Date d = new Date(-1,10,20);
    try {
     d.nextDate();
     Assert.fail();
   } catch (IllegalArgumentException ee){
     Assert.assertEquals("Exception error: IllegalArgumentException", ee.getMessage());
   }
  }
//paramaterized testing
    @Test
  void nextDateOk_test() {
    Result result = JUnitCore.runClasses(DateNextDateOkTest.class);
    for (Failure failure : result.getFailures()){
      System.out.println(failure.toString());
    }
    }
    @Test
  void nextDateException_test() {
      Result result = JUnitCore.runClasses(DateNextDateExceptionTest.class);
    for (Failure failure : result.getFailures()){
      System.out.println(failure.toString());
  }
}
  }