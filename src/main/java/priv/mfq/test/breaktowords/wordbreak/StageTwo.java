package priv.mfq.test.breaktowords.wordbreak;

import priv.mfq.test.breaktowords.dictionary.CustomizedDictionary;
import priv.mfq.test.breaktowords.util.WordBreakUtil;

import java.util.List;

public class StageTwo implements BreakToWords {


    /**
     * 根据定制化字典进行字符串分割操作
     * @param str 输入字符串
     * @return
     */
    @Override
    public List<String> wordBreak(String str) {
        return WordBreakUtil.breakToWords(str, CustomizedDictionary.getDictionary());
    }
    
}
