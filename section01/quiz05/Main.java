package section01.quiz05;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		int lt = 0, rt = str.length() - 1;
		char[] s = str.toCharArray();
		while(lt < rt) {
			// 둘 다 알파벳인지 체크
			if(Character.isAlphabetic(s[lt]) == false) {
				lt++;
				continue;
			}
			
			if(Character.isAlphabetic(s[rt]) == false) {
				rt--;
				continue;
			}
			
			char tmp = s[lt];
			s[lt] = s[rt];
			s[rt] = tmp;
			lt++;
			rt--;
		}
		String answer = String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
