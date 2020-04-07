package priv.mfq.test.breaktowords.wordbreak;

import priv.mfq.test.breaktowords.dictionary.CustomizedDictionary;
import priv.mfq.test.breaktowords.dictionary.StandardDictionary;
import priv.mfq.test.breaktowords.util.WordBreakUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StageThree implements BreakToWords {


    /**
     * 结合基础字典和定制化字典进行字符串分割操作
     * @param str 输入字符串
     * @return
     */
    @Override
    public List<String> wordBreak(String str) {
        Set<String> dictSet = new HashSet<>();
        dictSet.addAll(StandardDictionary.getDictionary());
        dictSet.addAll(CustomizedDictionary.getDictionary());
        return WordBreakUtil.breakToWords(str, dictSet);
    }
    
}
