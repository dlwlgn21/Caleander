package jihooscaleander;

import java.util.Scanner;

public class Month {
	int[] nomal = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int[] special = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isyearLeap(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	    }

	public int maxdayofMonth(int year, int num) {
		Month mon = new Month();
		if (mon.isyearLeap(year)) {
			return special[num - 1];
		} else
			return nomal[num - 1];
	}

	public void printCaleander(int year, int month) {
		Scanner scanner = new Scanner(System.in);
		Month mon = new Month();
		System.out.printf("      %2d년      %2d월 \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		int maxDay = mon.maxdayofMonth(year, month);
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");

		scanner.close();
	}

	public static void main(String[] args) {

	}
}
