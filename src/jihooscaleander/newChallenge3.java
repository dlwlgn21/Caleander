package jihooscaleander;

import java.util.Scanner;

public class newChallenge3 {
	public String PROMPT = "CAL > ";

	public void runPrompt() {
		Month mon = new Month();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("연도를 입력 하십시오. : ");
	    	System.out.println("Year : ");
	    	int num = scanner.nextInt();
			System.out.println("달을 입력 하십시오. : ");
			System.out.println("Month: ");
			int num2 = scanner.nextInt();
			if (num2 == -1) {
				System.out.println("프로그램 종료를 입력하셨습니다.");
				break;
			} else if (num2 > 12) {
				System.out.println("프로그램 종료를 입력하셨습니다.");
				break;
			}
		    mon.printCaleander(num, num2);
		}
		scanner.close();

	}

	public static void main(String[] args) {
		newChallenge3 p = new newChallenge3();
	p.runPrompt();
	
		
	}
}
