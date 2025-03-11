package section06.quiz04;

import java.util.Scanner;

public class Main {

//	public ArrayList<Integer> solution(int s, int n, int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<>();
////		System.out.print(answer);
//		// arr의 길이만큼 순회
//			// 요소가 리스트에 있을 경우
//				// 해당 요소 제거
//				// 맨 앞에 추가
//			// 요소가 리스트에 없을 경우
//				// 맨 앞에 추가
//				// 맨 뒤 삭제
//		for(int i : arr) {
//			if(answer.contains(i)) {
//				answer.remove(Integer.valueOf(i));
//				answer.add(0, i);
//			} else {
//				if(answer.size() >= s) {
//					answer.remove(answer.size() - 1);
//				}
//				answer.add(0, i);
//			}
//		}
//		return answer;
//	}
	
	public int[] solution(int size, int n, int[] arr){
		int[] cache=new int[size];
		for(int x : arr){
			int pos=-1;
			for(int i=0; i<size; i++) if(x==cache[i]) pos=i;
			if(pos==-1){
				for(int i=size-1; i>=1; i--){
					cache[i]=cache[i-1];
				}
			}
			else{
				for(int i=pos; i>=1; i--){
					cache[i]=cache[i-1];
				}
			}
			cache[0]=x;
		}
		return cache;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i : T.solution(s, n, arr)) {
			System.out.print(i + " ");
		}
	}
}
