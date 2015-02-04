package com.vkasturi.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.vkasturi.util.NumGuessUtils;

public class NumGuessUtilsTest {

  int LOWER_BOUND = 1;
  int UPPER_BOUND = 10;

  @Test
  public void testNumGuessUtils_1() throws Exception {
    NumGuessUtils result = new NumGuessUtils();
    assertNotNull(result);
  }

  @Test
  public void testConvertIntoNumeric_1() throws Exception {
    NumGuessUtils fixture = new NumGuessUtils();
    String str = "";

    int result = fixture.ConvertIntoNumeric(str);

    assertNotNull(result);
    assertEquals(0, result);
  }

  @Test
  public void testGetRandomNumber_1() throws Exception {
    int LOWER_BOUND = 1;
    int UPPER_BOUND = 1;

    int result = NumGuessUtils.getRandomNumber(LOWER_BOUND, UPPER_BOUND);

    assertEquals(0, result);
  }

  @Test
  public void testGetRandomNumber_2() throws Exception {
    int LOWER_BOUND = 1;
    int UPPER_BOUND = 0;

    int result = NumGuessUtils.getRandomNumber(LOWER_BOUND, UPPER_BOUND);

    assertEquals(0, result);
  }

  @Test
  public void testGetRandomNumber_3() throws Exception {
    int LOWER_BOUND = 0;
    int UPPER_BOUND = 1;

    int result = NumGuessUtils.getRandomNumber(LOWER_BOUND, UPPER_BOUND);

    assertEquals(0, result);
  }

  public static void main(String[] args) {
    new org.junit.runner.JUnitCore().run(NumGuessUtilsTest.class);
  }

}
