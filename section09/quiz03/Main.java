package section09.quiz03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
	int time;
	char state;

	public Time(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Time o) {
		if (this.time == o.time) {
			return this.state - o.state;
		} else {
			return this.time - o.time;
		}
	}
}

public class Main {

	public int solution(int n, ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		int cnt = 0;
		Collections.sort(arr);
		for (Time t : arr) {
			if (t.state == 's') {
				cnt++;
			} else {
				cnt--;
			}
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int sT = kb.nextInt();
			int eT = kb.nextInt();
			arr.add(new Time(sT, 's'));
			arr.add(new Time(eT, 'e'));
		}
		System.out.print(T.solution(n, arr));
	}
}
