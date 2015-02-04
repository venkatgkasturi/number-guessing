package com.vkasturi.model;

/**
 */
public class HigherLowerModel {

  /**
   * Method isGuessCorrect.
   * @param number int
   * @param guess int
   * @return boolean
   */
  public boolean isGuessCorrect(int number, int guess) {
    return guess == number;
  }

  /**
   * Method isGuessHigher.
   * @param guess int
   * @param number int
   * @return boolean
   */
  public boolean isGuessHigher(int guess, int number) {
    return guess > number;
  }

  /**
   * Method isGuessLower.
   * @param guess int
   * @param number int
   * @return boolean
   */
  public boolean isGuessLower(int guess, int number) {
    return guess < number;
  }

}
