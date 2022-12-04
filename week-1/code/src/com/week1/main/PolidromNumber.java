package com.week1.main;

public class PolidromNumber {

	/**
	 * 10-100 arası sayılardan palindromik sayı elde etme ana fonksiyonu
	 */
	public static void polidromeNumberCalculator() {
		int step = 0;
		long number;
		int newNumber = 0;
		int maxStep = 0;

		for (int i = 10; i <= 100; i++) {
			number = i;
			while (!isPolidrome(number)) {
				step++;
				number = number + reverseNumber(number);
				if (step>maxStep) {
					maxStep = step;
					newNumber = i;
				}
			}
			step = 0;
		}
		printChain(newNumber);
	}

	/**
	 * @Note: Sayinin palidrom olup olmagıdı sorgulanır.
	 * @param number
	 * @return
	 */
	private static boolean isPolidrome(long number) {
		String str = String.valueOf(number);
		int length = str.length() - 1;

		for (int i = 0; i <= length; i++) {
			if (str.charAt(i) != str.charAt(length - i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @Note: Sayisinin tersi alınır	
	 * @param number
	 * @return
	 */
	private static long reverseNumber(long number) {
		long reverseNumber = 0;

		while (number > 0) {
			int digit = (int) (number % (10));
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
		}

		return reverseNumber;
	}

	/**
	 * @Note: ekrana en uzun işlem adımına sahip sayıyı ve basamakları yazdırma
	 * @param number
	 */
	private static void  printChain(int number) {
		int step=0;
		long numb = number;
		while (!isPolidrome(numb)) {
			step++;
			System.out.format("%d .adım => %d ? %d = %d\n",step,numb,reverseNumber(numb),(numb + reverseNumber(numb)));
			numb = numb + reverseNumber(numb);
		}
		
		System.out.println("Toplam zincirleme işlem sayısı : " + step);
		System.out.println("En uzun zincire sahip olan sayı : " + number);
	}

}
