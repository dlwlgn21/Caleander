package jihooscaleander;

import java.util.Scanner;

public class Month {
	int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxdayofMonth(int num) {
		return a[num - 1];
	}

	public void printCaleander(int month) {
		Scanner scanner = new Scanner(System.in);
		String PROMPT = "CAL > ";
		while (true) {		
				System.out.println("출력하고 싶은 달을 입력 하십시오. : ");
				System.out.println(PROMPT);
				int num = scanner.nextInt();
		if(num == -1) {
			System.out.println("프로그램을 종료합니다");
			break;
		}else if(num > 12 ) {
			System.out.println("프로그램을 종료합니다");
			break;
		}else if(num == 0) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		System.out.printf("      %2d년      %2d월 \n", 2017 ,num);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		Month mon = new Month();
		int maxDay = mon.maxdayofMonth(num);
		for(int i = 1; i <=maxDay; i++) {
			System.out.printf("%3d",i);
	    if(i % 7 ==0) {
	    	System.out.println("");
	    }
	    	
		    
		}
	    System.out.println("");
		
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		}    
	}
	public static void main(String[] args) {
		Month mon = new Month();
		mon.printCaleander(2);

	}
}
