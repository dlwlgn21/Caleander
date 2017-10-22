package jihooscaleander;

import java.util.Scanner;

public class Month {
	int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxdayofMonth(int num) {
		return a[num - 1];
	}

	public static void main(String[] args) {
		Month mon = new Month();
		String PROMPT = " CAL> ";

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("달을 입력해주세요.");
			System.out.print(PROMPT);
			int num = scanner.nextInt();
			if (num == -1) {
				System.out.println("안녕~~");
				break;
			} else if (num > 12) {
				System.out.println("바이바이");
				break;
			}
			System.out.printf("%d월은 %d일 까지 있습니다. \n", num, mon.maxdayofMonth(num));

		}
		 scanner.close();	
	}

}
