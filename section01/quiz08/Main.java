package section01.quiz08;

import java.util.Scanner;

public class Main {

//	public String solution(String str) {
//		String tmp = "";
//		for (char c : str.toCharArray()) {
//			if (Character.isAlphabetic(c))
//				tmp += c;
//		}
//		String reversed = new StringBuilder(tmp).reverse().toString();
//		return tmp.equalsIgnoreCase(reversed) ? "YES" : "NO";
//	}

	public String solution(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed) ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}