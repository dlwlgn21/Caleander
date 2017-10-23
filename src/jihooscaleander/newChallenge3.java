package jihooscaleander;

import java.util.Scanner;

public class newChallenge3 {
	public String PROMPT = "CAL > ";

	public void runPrompt() {
		Month mon = new Month();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("달을 입력해주세요.");
			System.out.print(PROMPT);
			int num = scanner.nextInt();
			if (num == -1) {
				System.out.println("프로그램 종료를 입력하셨습니다.");
				break;
			} else if (num > 12) {
				System.out.println("프로그램 종료를 입력하셨습니다.");
				break;
			}
		    mon.printCaleander(2);
		}
		scanner.close();

	}

	public static void main(String[] args) {
		newChallenge3 p = new newChallenge3();
		
		p.runPrompt();
		
	}
}
