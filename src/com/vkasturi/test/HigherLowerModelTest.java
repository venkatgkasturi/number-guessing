package com.vkasturi.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.vkasturi.model.HigherLowerModel;

public class HigherLowerModelTest {

  /**
   * Run the boolean isGuessCorrect(int,int) method test.
   * 
   * @throws Exception
   */
  @Test
  public void testIsGuessCorrect() throws Exception {
    HigherLowerModel fixture = new HigherLowerModel();
    int number = 1;
    int guess = 1;

    boolean result = fixture.isGuessCorrect(number, guess);

    assertEquals(true, result);
  }

  /**
   * Run the boolean isGuessHigher(int,int) method test.
   * 
   * @throws Exception
   */
  @Test
  public void testIsGuessHigher() throws Exception {
    HigherLowerModel fixture = new HigherLowerModel();
    int guess = 1;
    int number = 1;

    boolean result = fixture.isGuessHigher(guess, number);
    assertEquals(false, result);
  }

  /**
   * Run the boolean isGuessLower(int,int) method test.
   * 
   * @throws Exception
   */
  @Test
  public void testIsGuessLower() throws Exception {
    HigherLowerModel fixture = new HigherLowerModel();
    int guess = 1;
    int number = 1;

    boolean result = fixture.isGuessLower(guess, number);
    assertEquals(false, result);
  }

  /**
   * Launch the test.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    new org.junit.runner.JUnitCore().run(HigherLowerModelTest.class);
  }
}