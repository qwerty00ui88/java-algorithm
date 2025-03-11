package section08.quiz14;

import java.util.ArrayList;
import java.util.Scanner;

// 좌표
class Point{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}


// 1. 조합 생성(dfs)
// 2. 해당 조합의 도시의 피자배달거리 계산
// 3. 그 중 최소값 찾음

// 집의 피자배달거리 : 제일 가까운 피자집 거리, 도시의 피자배달거리: 집의 피자배달거리의 합
class Main {
	static int n, m, len, answer=Integer.MAX_VALUE; 
	static int[] combi;
	static ArrayList<Point> hs, pz;
	
	public void DFS(int L, int s){ // L: Level, s: start
		// 2. 해당 조합의 도시의 피자배달거리 계산(dis: 집, sum: 도시)
		if(L==m){
			int sum=0;
			for(Point h : hs){
				int dis=Integer.MAX_VALUE;
				for(int i : combi){
					dis=Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
				}
				sum+=dis;
			}
			// 3. 최소값 찾기
			answer=Math.min(answer, sum);
		}
		// 1. 조합 생성
		else {
			for(int i=s; i<len; i++){
				combi[L]=i;
				DFS(L+1, i+1);
			}
		}
	}

	
	// n: 행/열 개수, m: 살리고자 하는 피자집 개수, len: 피자집 개수, answer: 도시 피자배달거리의 최소값
	// combi: 살리고자 하는 피자집의 조합(1개)
	// hs: house 좌표 배열, pz: pizza 좌표 배열
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		pz=new ArrayList<>();
		hs=new ArrayList<>();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int tmp=kb.nextInt();
				if(tmp==1) hs.add(new Point(i, j));
				else if(tmp==2) pz.add(new Point(i, j));
			}
		}
		len=pz.size();
		combi=new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}