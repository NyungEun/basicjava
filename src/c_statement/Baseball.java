package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임을 만들어주세요.

			
			int a = (int) (Math.random() * 9) + 1;
			int b = (int) (Math.random() * 9) + 1;
			int c = (int) (Math.random() * 9) + 1;

			if (a == b) {
				b = (int) (Math.random() * 9) + 1;
			}

			if (b == c || a == c) {
				c = (int) (Math.random() * 9) + 1;

			}
			
			
		
//			int a = (int) (Math.random() * 9) + 1;
//			
//			do{
//				int b = (int) (Math.random() * 9) + 1;
//
//			} while (a == b);
//			
//			
//			do{
//				int c = (int) (Math.random() * 9) + 1;
//
//			} while(a == b || b == c);
			

			
			
			
			//
			// else {
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
			// }

			
			while(true){
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.print("세 수를 입력해주세요: ");
			int n1 = Integer.parseInt(s.nextLine());
			int n2 = Integer.parseInt(s.nextLine());
			int n3 = Integer.parseInt(s.nextLine());
			
			

			System.out.print(n1);
			System.out.print(n2);
			System.out.print(n3);
			System.out.println();

			int strike = 0;
			int ball = 0;
			int out = 0;

			// boolean strike = false;
			// boolean ball = false;
			// boolean out = false;

//			if (a == n1 && b == n2 && c == n3) {
//				strike++;
//				System.out.println(strike + "S");
				
//			} else {
//				strike = 0;
				// }
				// if ((a == n2 || a == n3) && a != n1 ){
				// ball++;
				// } else {
				// ball;
				// }
				// if (a != n1 && a != n2 && a != n3){
				// out = true;
				// }
//			}
			
			
			if (a == n1){
				strike++;
			} else if (a == n2){
				ball++;
			} else if (a == n3){
				ball++;
			} else {
				out++;
			}
			
			if (b == n1){
				ball++;
			} else if (b == n2){
				strike++;
			} else if (b == n3){
				ball++;
			} else {
				out++;
			}
			
			if (c == n1){
				ball++;
			} else if (c == n2){
				ball++;
			} else if (c == n3){
				strike++;
			} else {
				out++;
			}
			
			System.out.print(strike + "S ");
			System.out.print(ball + "B ");
			System.out.print(out + "O");
			
			if(strike == 3 && ball == 0 && out == 0){
				System.out.println("정답입니다!");
				break;
			}
		}
		
		

		
		
	}
}
