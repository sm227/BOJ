import java.util.Scanner;
import java.util.ArrayList;

public class _1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int newNum = 0;
		int count = 0;

		while (num == newNum) {
			ArrayList<Integer> firstNum = new ArrayList<>();
			ArrayList<Integer> secondNum = new ArrayList<>();

			while (num > 0) {
				firstNum.add(num % 10);
				num = num / 10;
			}

			int sum = 0;
			for (int i = 0; i < firstNum.size(); i++) {

				sum = sum + firstNum.get(i);
			}

			while (sum > 0) {
				secondNum.add(sum % 10);
				sum = sum / 10;
			}

			

			String tempNum = String.valueOf(firstNum.get(0)) + String.valueOf(secondNum.get(0));

			

			newNum = Integer.parseInt(tempNum);
			count += 1;
		}
		System.out.println(count);
	}

}
