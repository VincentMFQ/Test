package priv.mfq.test.breaktowords.wordbreak;

import java.util.List;

public interface BreakToWords {
    /**
     * 根据字典分割字符串为单词组成的句子
     * @param str 输入字符串
     * @return
     */
    List<String> wordBreak(String str);

}
