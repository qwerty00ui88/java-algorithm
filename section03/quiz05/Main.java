package section03.quiz05;

import java.util.Scanner;

public class Main {
//	public int solution(int n) {
//		int answer = 0;
//		int[] arr = new int[n / 2 + 2];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//		}
//		int lt = 1, sum = arr[lt];
//		for (int rt = 2; rt < arr.length; rt++) {
//			sum += arr[rt];
//			if (sum == n) {
//				answer++;
//			}
//			while (sum >= n) {
//				sum -= arr[lt];
//				lt++;
//				if (sum == n) {
//					answer++;
//				}
//			}
//		}
//		return answer;
//	}
	
	public int solution(int n) {
		int answer = 0, cnt = 1;
		n--; // 14
		while(n > 0) {
			cnt++; // 2
			n = n - cnt; // 12
			if(n % cnt == 0) answer++; 
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
