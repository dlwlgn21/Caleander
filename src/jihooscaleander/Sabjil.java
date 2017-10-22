package jihooscaleander;

import java.util.Scanner;

public class Sabjil {

	public static void main(String[] args) {
		
		int [] a = {31,28,31,30,31,30,31,31,30,31,30,31};		
		System.out.println("값을 입력하시면 달의 마지막날을 출력합니다  : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.printf("%d월은 %d일 까지 있습니다. \n", num, a[num -1]);
		if(num == 1) {				
			System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[0]);
		}else if(num == 2){
			System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[1]);
		}else if(num == 3) {
		    System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[2]);
		}else if(num == 4) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[3]);
	    }else if(num == 5) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[4]);
        }else if(num == 6) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[5]);
        }else if(num == 7) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[6]);
        }else if(num == 8) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[7]);
        }else if(num == 9) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[8]);
        }else if(num == 10) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[9]);
        }else if(num == 11) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[10]);
        }else if(num == 12) {
	        System.out.printf("%d월의 마지막 날은 %d일 입니다 \n",num, a[11]);
        }else {
        	System.out.println("1~12사이의 값을 입력해야 정상적으로 프로그램이 작동합니다");
        }
		scanner.close();
	}

}
