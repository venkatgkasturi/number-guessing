package com.vkasturi.util;

import java.util.Random;
import java.util.Scanner;

import com.vkasturi.model.HigherLowerModel;

/**
 */
public class NumGuessUtils {

	private Scanner input = new Scanner(System.in);
	private int number;
	private int guess;
	private boolean IsgameRunning = true;

	/**
   */
	public enum Level {
		higher, lower, yes;
	}

	/**
	 * Method playgame.
	 * 
	 * @param min
	 *            int
	 * @param max
	 *            int
	 */
	public void playgame(int min, int max) {
		System.out.println("Please type ready to begin :");
		String end = "end";
		String inp = "";

		input.nextLine();

		while (IsgameRunning) {

			number = getRandomNumber(min, max);
			HigherLowerModel model = new HigherLowerModel();

			do {
				if (inp.equalsIgnoreCase(end)) {
					break;
				} else if (inp.equalsIgnoreCase("ready")) {
					continue;
				}
				guess = guessNumber(input);
				System.out.println("Is the number : " + guess + " ?");

				while (guess < min || guess > max) {
					System.out.println("Wrong number, try again.");
					guess = guessNumber(input);
				}
				if (model.isGuessHigher(number, guess)) {
					System.out.println(Level.higher);
				}
				if (model.isGuessLower(number, guess)) {
					System.out.println(Level.lower);
				}
			} while (guess != number);

			if (model.isGuessCorrect(number, guess)) {
				System.out.println(Level.yes);
				System.out.println("User chooses number " + guess
						+ " in his mind.");
			}

			keepPlaying(input);
		}
		input.close();
	}

	/**
	 * Method getRandomNumber.
	 * 
	 * @param LOWER_BOUND
	 *            int
	 * @param UPPER_BOUND
	 *            int
	 * @return int
	 */
	public static int getRandomNumber(int LOWER_BOUND, int UPPER_BOUND) {
		Random generator = new Random();
		int randomNumber = 0;

		if (!(LOWER_BOUND == 0 || UPPER_BOUND == 0)
				&& UPPER_BOUND > LOWER_BOUND) {
			randomNumber = generator.nextInt(UPPER_BOUND) + LOWER_BOUND;
		} else {
			System.out
					.println("UPPER_BOUND should be greater than LOWER_BOUND");
		}
		// Just for Debugging
		// System.out.println("Generating new number: " + randomNumber);
		return randomNumber;
	}

	/*
	 * Method to ask for a number to guess.
	 */
	/**
	 * Method guessNumber.
	 * 
	 * @param keyboard
	 *            Scanner
	 * @return int
	 */
	public int guessNumber(Scanner keyboard) {
		return ConvertIntoNumeric(keyboard.nextLine());
	}

	/**
	 * Method keepPlaying.
	 * 
	 * @param keyboard
	 *            Scanner
	 * @return boolean
	 */
	public boolean keepPlaying(Scanner keyboard) {
		boolean isReady = true;
		String ready = "ready";
		if (keyboard.nextLine().equalsIgnoreCase(ready)) {
			isReady = true;
		} else {
			isReady = false;
		}
		return isReady;
	}

	/**
	 * Method ConvertIntoNumeric.
	 * 
	 * @param str
	 *            String
	 * @return int
	 */
	public int ConvertIntoNumeric(String str) {
		int val = 0;
		try {
			val = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			
			System.out.println("Not a number");
		}
		return val;
	}

}
