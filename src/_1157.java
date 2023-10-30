import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		str = str.toLowerCase();
		String[] arr = str.split("");

		String result="";
		int count = 0;
		
		

		
		// 검사
		for (int i = 0; i < str.length(); i++) { 
			int num = 0;
			
			String temp = arr[i];

			for (int j = 0; j < str.length(); j++) {
				String b = arr[j];
				if (b.equals(temp)) {
					num += 1;
					
				}
				
			}
			if (count <= num) {
				// TODO 같은 문자열 발생시 비교 문제 해결
				if(result != temp && count == num) result = "?";
				count = num;
				result = temp;
			}
			else if (!result.equals(temp) && count == num) {
				result = "?";
			}
			
		}
		result = result.toUpperCase();
		System.out.println(result); 
	}

}
