package home_work_4;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int minLength = Math.min(o1.length(), o2.length());
        char[] name1 = o1.toCharArray();
        char[] name2 = o2.toCharArray();
        for (int i = 0; i < minLength; i++) {
            if ((int) name1[i]!=(int) name2[i]) {
                result = (int) name1[i] - (int) name2[i];
                break;
            }
        }
        return result;
    }
}
