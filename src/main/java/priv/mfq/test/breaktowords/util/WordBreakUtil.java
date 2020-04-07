package priv.mfq.test.breaktowords.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordBreakUtil {

    //根据给定的字典内容拆分字符串
    public static List<String> breakToWords(String str, Set<String> dict) {
        return recursionWords(str, dict, 0);
    }

    private static List<String> recursionWords(String str, Set<String> dict, int start) {
        List<String> result = new LinkedList<>();
        //尾部处理
        if (start == str.length()) {
            result.add("");
        }
        for (int end = start + 1; end <= str.length(); end++) {
            //截取字符与字典匹配则进行递归
            if (dict.contains(str.substring(start, end))) {
                final int finalEnd = end;
                recursionWords(str, dict, end).stream().forEach(item ->
                        result.add(str.substring(start,finalEnd) + " " + item)
                );

            }
        }
        return result;
    }
}
