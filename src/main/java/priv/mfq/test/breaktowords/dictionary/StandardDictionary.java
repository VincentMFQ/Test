package priv.mfq.test.breaktowords.dictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StandardDictionary {

    private Set<String> dict = new HashSet<>();

    private void initDictionary(List<String> wordList){
        dict.addAll(wordList);
    }

    private StandardDictionary(){
        List<String> wordList = Arrays.asList("i","like","sam","sung","samsung","mobile","ice","cream","man","go","and");
        initDictionary(wordList);
    }

    private static StandardDictionary instance=new StandardDictionary();

    public static Set<String> getDictionary(){
        return instance.dict;
    }



}
