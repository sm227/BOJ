import java.util.ArrayList;
import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] wordList = new String[input];
        ArrayList<String> resultList = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < input; i++) {
            ArrayList<String> eachList = new ArrayList<>();
            ArrayList<String> tempList = new ArrayList<>();
            wordList[i] = sc.next();

            // 문자열을 한 글자씩 잘라서 배열에 저장
            for (int k = 0; k < wordList[i].length(); k++) {
                eachList.add(wordList[i].substring(k,k+1));
            }

            // 단어검사
            for (int j=0; j < eachList.size(); j++) {
                int tempCount = 0;
               if(!tempList.contains(eachList.get(j))) {
                   tempList.add(eachList.get(j));
               }
               else if(tempList.contains(eachList.get(j)) && eachList.get(j).equals(tempList.get(tempList.size()-1))) {

               }
               else break;

               if(j == eachList.size()-1) count ++;

//               tempCount++;
//               if(tempCount == tempList.size()){
//                   count++;
//               }
            }
//            System.out.println(eachList);
//            System.out.println(tempList);
        }
        System.out.println(count);
    }
}
