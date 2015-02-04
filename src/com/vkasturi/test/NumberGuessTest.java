package com.vkasturi.test;

import static org.junit.Assert.assertNotNull;

import org.junit.*;

import com.vkasturi.NumberGuess;

public class NumberGuessTest {

  /**
   * Run the NumberGuess() constructor test.
   */
  @Test
  public void testNumberGuess_1() throws Exception {
    NumberGuess result = new NumberGuess();
    assertNotNull(result);
  }

  /**
   * Run the void main(String[]) method test.
   * 
   * @throws Exception
   */
  @Test
  public void testMain_1() throws Exception {
    String[] args = new String[] {};
    NumberGuess.main(args);
  }

  /**
   * Launch the test.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    new org.junit.runner.JUnitCore().run(NumberGuessTest.class);
  }
}