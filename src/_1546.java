import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class _1546 {
    public static void main(String[] args) {
        int subject ;
        ArrayList<Integer> score = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        subject = sc.nextInt();
       
        

        for(int i =0; i<subject; i++) {
            score.add(sc.nextInt());
        }

        float maxScore = Collections.max(score);


        ArrayList<Float> fake = new ArrayList<Float>();


        for (int i =0; i < subject; i++) {
            fake.add(score.get(i) / maxScore * 100);
        }


        float result = 0;
        float sum = 0;
        for (int i=0; i< subject; i++) {

            sum = sum + fake.get(i);

            result = sum / subject;
        }
        System.out.println(result);
        sc.close();

    }
}
