import java.util.ArrayList;

public class _4673 {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> selfNum = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < 9980; i++) {
            int a = d(i);
            if (a < 10000) {
                selfNum.add(a);
            }
        }
        for (int i = 1; i < 10000; i++) {
            resultList.add(i);

        }
        for (int i = 0; i < selfNum.size(); i++) {
            int a = selfNum.get(i);
            ;
            for (int j = 0; j < resultList.size(); j++) {
                if (a == resultList.get(j)) {
                    resultList.remove(Integer.valueOf(selfNum.get(i)));
                }
            }

        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }

    static int d(int num) {
        ArrayList<Integer> arrNum = new ArrayList<>();
        int result = num;
        while (num > 0) {
            arrNum.add(num % 10);
            num /= 10;
        }
        for (int i = 0; i < arrNum.size(); i++) {
            result += arrNum.get(i);
        }
        return result;
    }
}