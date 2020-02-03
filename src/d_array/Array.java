package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >> 
		 * - int[] number = new int[5]; 
		 * - int[] number = new int[]{10, 20, 30, 40, 50}; 
		 * - int[] number = {10, 20, 30, 40, 50};
		 */

		// 배열은 참조형 타입입니다.
		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.

		System.out.println(array);

		System.out.println(array[0]); // 실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		// index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등}
		// 배열의 최대 크기는 int의 최대값(약 20억)이다.

		String arrayStr = Arrays.toString(array); // 배열의 모든 인덱스에 저장된 값을 문자열로 반환한디.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3}; // 값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; // 선언과 초기화를 동시에 해야한다.
		int[] iarry3;
//		iArray3 = {1. 2. 3}; // 컴파일 에러 발생
		
		
		array[0] = 10; // 인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[5] = 50; //ArrayIndexOutOfBoundsException 발생
		
		
		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.

		int[] a = new int[10];
		
		// 모든 인덱스에 있는 값을 변경해주세요.
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 80;
		a[8] = 90;
		a[9] = 100;
		
		// 모든 인덱스에 있는 값을 더해주세요.
		int sum = 0;
		//sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9];
		sum += a[0];
		sum += a[1];
		sum += a[2];
		sum += a[3];
		sum += a[4];
		sum += a[5];
		sum += a[6];
		sum += a[7];
		sum += a[8];
		sum += a[9];
		
		System.out.println(sum);
		
		// index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		for (int i = 0; i < array.length; i++){
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));
		
		// 배열에 숫자를 저장하고 합계와 평균을 구해보자
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0; // 합계
		double avg = 0; // 평균

		for (int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		avg = (double)sum / numbers.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 향상된 for문
		for (int number : numbers){ // 배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}
		
		for (int number : numbers){
			number = 0; // numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		
		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int min = numbers[0];
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++){
			if (min > numbers[i]){
				min = numbers[i];
			}
			
			if (max < numbers[i]){
				max = numbers[i];
			}
		}
		System.out.println("최소값 : " + min + "/ 최대값 : " + max);

		
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		for (int i = 0; i < shuffle.length * 10; i++){
		int random = (int)(Math.random() * shuffle.length);
		int temp = shuffle[0];
		shuffle[0] = shuffle[random];
		shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
	
		
		// 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] num = new int[10];		
		for (int i = 0; i < 500; i++){
		int ran = (int)(Math.random() * 10) + 1;
		
		for (int j = 1; j <= 10; j++){
			if (ran == j){
				num[j-1]++;
			}
		}
	}
		for (int x = 1; x <= 10; x++){
			System.out.println(x + "가 생성된 횟수 : " + num[x-1]);
			}
		
//		if (ran == 1){
//			num[0]++;
//		} else if (ran == 2){
//			num[1]++;
//		} else if (ran == 3){
//			num[2]++;
//		} else if (ran == 4){
//			num[3]++;
//		} else if (ran == 5){
//			num[4]++;
//		} else if (ran == 6){
//			num[5]++;
//		} else if (ran == 7){
//			num[6]++;
//		}else if (ran == 8){
//			num[7]++;
//		}else if (ran == 9){
//			num[8]++;
//		}else if (ran == 10){
//			num[9]++;
//		}
				
		
//		System.out.println("1이 생성된 횟수 : " + num[0]);
//		System.out.println("2가 생성된 횟수 : " + num[1]);
//		System.out.println("3이 생성된 횟수 : " + num[2]);
//		System.out.println("4이 생성된 횟수 : " + num[3]);
//		System.out.println("5이 생성된 횟수 : " + num[4]);
//		System.out.println("6이 생성된 횟수 : " + num[5]);
//		System.out.println("7이 생성된 횟수 : " + num[6]);
//		System.out.println("8이 생성된 횟수 : " + num[7]);
//		System.out.println("9이 생성된 횟수 : " + num[8]);
//		System.out.println("10이 생성된 횟수 : " + num[9]);
		
		
		
		
		
		
		
		
		// 위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		
		int MinNum = num[0];
		int MaxNum = num[0];

		if (MinNum > num[i]){
			MinNum = num[i];
		}
		

		

	}
}
