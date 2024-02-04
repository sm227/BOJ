import java.util.ArrayList;
import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();



        for(int i=1; i<caseNum; i++) {


            String inputNum = sc.nextLine();
            String [] tempNum = (inputNum.split("\\s"));
            int count = Integer.parseInt(tempNum[0]);
            int[] finalNum = new int[count];
            finalNum[i-1] =  Integer.parseInt(tempNum[i]);
            System.out.println(finalNum[i-1]);
        }
    }
}
