import java.util.ArrayList;

public class _4673 {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> selfNum = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        // 셀프 넘버 구하는 법 : 생성자로 만들어지지 않는 모든 수.

        for (int i = 0; i < 9968; i++) {
            int a = d(i);
            selfNum.add(a);
//            System.out.println(a);
        }
        for (int i=0; i<=10000; i++) {
            resultList.add(i);

        }
//        System.out.println(resultList);
        for(int i=0; i < selfNum.size(); i++) {
            int a = resultList.get(i);
//            System.out.println(a);
//            resultList.remove(Integer.valueOf(selfNum.get(i)));
        }
        System.out.println(selfNum);

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