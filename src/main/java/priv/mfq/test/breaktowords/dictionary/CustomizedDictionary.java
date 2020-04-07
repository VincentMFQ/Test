package priv.mfq.test.breaktowords.dictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomizedDictionary {
    private Set<String> dict = new HashSet<>();

    private void initDictionary(List<String> wordList){
        dict.addAll(wordList);
    }

    private CustomizedDictionary(){
        List<String> wordList = Arrays.asList("i","like","sam","sung","mobile","icecream","man","go","mango","and");
        initDictionary(wordList);
    }

    private static CustomizedDictionary instance=new CustomizedDictionary();

    public static Set<String> getDictionary(){
        return instance.dict;
    }
}
