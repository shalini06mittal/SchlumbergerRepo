package com.conditional;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		/**
		 * compare for exact equality
		 * 1. dice => 1, 2,3 ,4 ,5, 6
		 * 2. toss the coin => heads and tails
		 * 3. country => India, Singapore, japan, .....
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("roll the dice");
		int dice = sc.nextInt();
		//		if(dice ==1) {
		//			System.out.println("move 1 step");
		//		}
		//		else if(dice == 2) {
		//			System.out.println("move 2 steps");
		//		}
		//		else if(dice == 6) {
		//			System.out.println("move 6 steps");
		//		}
		//		else if(dice == 3) {
		//			System.out.println("move 3 steps");
		//		}
		//		else if(dice == 4) {
		//			System.out.println("move 4 steps");
		//		}
		//		else if(dice == 5) {
		//			System.out.println("move 5 steps");
		//		}
		//		else {
		//			System.out.println("roll again");
		//		}
		// fall through in switch - case
		switch(dice) {
			case 1:
				System.out.println("1 step");
				System.out.println("asdkjal");
				break;
			case 2:
				System.out.println("2 step");
				break;
			case 3:
				System.out.println("3 step");
				break;
			case 4:
				System.out.println("4 step");
				break;
			case 5:
				System.out.println("5 step");
				break;
			case 6:
				System.out.println("6 step");
				break;
			default:
				System.out.println("roll again");
		}




	}

}
