package jihooscaleander;
import java.util.Scanner;

public class Prompt {
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Caleander cal = new Caleander();

		int month = 1;
		int year = 2017;

		while (true) {
			System.out.println("년도를 입력하세요.(exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1)
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();

			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

			cal.printCalendar(year, month);
		}

		System.out.println("Bye~");
		scanner.close();
	}
	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
