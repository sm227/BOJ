import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class _2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(buffer.readLine());



        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            int a = Integer.parseInt(buffer.readLine());
            if (!numList.contains(a)) {
                numList.add(a);
            }
        }
        Collections.sort(numList);
//        numList.sort(Comparator.naturalOrder());
        for (int i=0; i<numList.size(); i++) {
            bw.write(String.valueOf(numList.get(i)));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
