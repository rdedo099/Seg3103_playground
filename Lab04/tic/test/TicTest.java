package tic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TicTest{

 @Test
 void test_updateBoard(){
   String[][] expected ={{"X","|_","|_"},{"_|","|_","|_"},{"_|","|_","|_"}};
   String[][] actual = Tic.updateBoard(0,0,1);
  assertArrayEquals(expected,actual);
 }
}