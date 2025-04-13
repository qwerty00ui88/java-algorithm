package section09.quiz02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
	int s, e;

	public Meeting(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Meeting o) {
		if (this.e == o.e) {
			return this.s - o.s;
		} else {
			return this.e - o.e;
		}
	}
}

public class Main {
	public int solution(int n, ArrayList<Meeting> meetings) {
		int answer = 0;
		Collections.sort(meetings);
		int et = 0;
		for (Meeting ob : meetings) {
			if (ob.s >= et) {
				answer++;
				et = ob.e;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Meeting> meetings = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			meetings.add(new Meeting(s, e));
		}
		System.out.println(T.solution(n, meetings));
	}
}
