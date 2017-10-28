package jihooscaleander;

import java.util.Scanner;

public class newChallange {
	public static void main(String [] args) {

    
	Scanner scanner = new Scanner(System.in);
	System.out.println("달을 입력하세요 : ");
	String PROMPT = "Cal > ";
	System.out.print(PROMPT);
	
	while(true) {
		int num = scanner.nextInt();
			if(num > 0 && num < 13) {
		System.out.printf("  <<%d년       %d월>> \n",2017,num);
		System.out.println("일    월    화     수       목      금     토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
		System.out.println("주의!! -1을 입력하기 전까지 프로그램은 종료 되지 않습니다.\n" );
	}else if(num > 13) {
		System.out.println("잘못된 값을 입력하셨습니다." );
		continue;
	}else if(num == -1) {
		System.out.println("프로그램 종료");
		break;
	}

	}
	
	}
}
