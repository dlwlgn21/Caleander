package jihooscaleander;
import java.util.Scanner;
public class Caleander {

	public static void main(String[] args) {
//		System.out.println("일    월    화     수       목      금     토");
//		System.out.println("--------------------");
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//		
		int a,b;
		System.out.println("두 숫자 를 입력하세요");
		Scanner scanner = new Scanner(System.in);
//		int c = scanner.nextInt();
//		int d = scanner.nextInt();	
		//여기까지가 내가 사용한 방법
		
		String s,s1;
		s = scanner.next();
		s1 = scanner.next();
		a = Integer.parseInt(s);
		b = Integer.parseInt(s1);
		System.out.printf("당신이 입력한 값 : %d,%d \n"  , a, b);
		
		System.out.printf("%d와 %d의 더하기 값은  %d입니다" ,a , b, a+b );
//		System.out.println("첫 번째로 입력한 값 : " +number);
//		System.out.println("두 번째로 입력한 값 : " +number2);
//		    System.out.println(number * number2);	
		
		scanner.close();
		
	}

}
