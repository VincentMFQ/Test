package priv.mfq.test.breaktowords.wordbreak;

import priv.mfq.test.breaktowords.dictionary.StandardDictionary;
import priv.mfq.test.breaktowords.util.WordBreakUtil;

import java.util.List;

public class StageOne implements BreakToWords {

    /**
     * 根据默认字典进行分割字符串操作
     * @param str 输入字符串
     * @return
     */
    @Override
    public List<String> wordBreak(String str) {
        return WordBreakUtil.breakToWords(str,StandardDictionary.getDictionary());
    }

}
