package 입출력연습;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferRea {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 한줄 입력해보세요.");
		try {
			String str= br.readLine();
			System.out.println(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}System.out.println("시스템 종료");
	}
}
