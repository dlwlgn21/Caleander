package jihooscaleander;

import java.util.Scanner;

public class Month {
	int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxdayofMonth(int num) {
		return a[num - 1];	
	}

	public static void main(String[] args) {
		Month mon = new Month();
		// int [] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("달을 입력해주세요. : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (12<num) { 
			System.out.println("잘못된 값을 입력하셨습니다");
		}
		
		System.out.printf("%d월은 %d일 까지 있습니다. \n", num, mon.maxdayofMonth(num));
		scanner.close();

	}
}
