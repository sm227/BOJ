import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(buffer.readLine());
        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(buffer.readLine());
        }

        Arrays.sort(arr); // 내림차순 정렬

        for(int i=0; i<num; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
