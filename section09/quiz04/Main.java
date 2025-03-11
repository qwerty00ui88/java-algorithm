package section09.quiz04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
    public int money;
	public int time;
    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture ob){
        return ob.time-this.time;
    }
}

class Main {
	static int n, max=Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr){
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		// 강의 리스트를 시간 순으로 내림차순
		Collections.sort(arr);
		
		int j = 0;
		for(int i = max; i >= 1; i--) {
			// 각 시간에 맞는 강의들의 보수를 우선순위 큐에 넣음
			for(; j<n; j++) {
				if(arr.get(j).time<i) break;
				pQ.offer(arr.get(j).money); 
			}
			// 가장 큰 보수를 선택하여 합산
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int m=kb.nextInt();
			int d=kb.nextInt();
			arr.add(new Lecture(m, d));
			if(d>max) max=d;
		}
		System.out.println(T.solution(arr));
	}
}