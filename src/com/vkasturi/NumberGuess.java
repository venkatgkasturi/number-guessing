package com.vkasturi;

import com.vkasturi.util.NumGuessUtils;

/**
 */
public class NumberGuess {

  /*
   * Below random number generation is configurable, I assumed it to be between 1 and 100;
   */
  static int min = 10;
  static int max = 90;

  /**
   * Method main.
   * @param args String[]
   */
  public static void main(String[] args) {
    NumGuessUtils util = new NumGuessUtils();
    util.playgame(min, max);

  }
}