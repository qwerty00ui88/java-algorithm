package section05.quiz08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Main {

//	환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
//	나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		// 큐에 삽입
		Queue<Person> Q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {
			// 첫 손님 꺼냄
			Person tmp = Q.poll();
			
			// 뒤에 우선순위 높은 사람 있으면 맨 뒤로 넣기
			for(Person p : Q) {
				if(p.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			// tmp가 우선순위인 경우
			if(tmp != null) {
				answer++;
				if(tmp.id == m) {
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
