package priv.mfq.test.breaktowords;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import priv.mfq.test.breaktowords.wordbreak.BreakToWords;
import priv.mfq.test.breaktowords.wordbreak.BreakToWordsFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class BreaktowordsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testStageOne(){
        BreakToWordsFactory breakToWordsFactory = new BreakToWordsFactory();
        BreakToWords one = breakToWordsFactory.getStage("one");
        List<String> r =one.wordBreak("ilikesamsungmobile");
        r.stream().forEach(System.out::println);
        List<String> result = Arrays.asList("i like sam sung mobile ","i like sam sung mobile ");
        for(String s: result){
            System.out.println(1);
            Assert.isTrue(r.contains(s),"stage one test fail");
        }
    }

    @Test
    void testStageTwo(){
        BreakToWordsFactory breakToWordsFactory = new BreakToWordsFactory();
        BreakToWords one = breakToWordsFactory.getStage("two");
        List<String> r =one.wordBreak("ilikesamsungmobileandmango");
        r.stream().forEach(System.out::println);
        List<String> result = Arrays.asList("i like sam sung mobile and man go ","i like sam sung mobile and mango ");
        for(String s: result){
            Assert.isTrue(r.contains(s),"stage two test fail");
        }
    }

    @Test
    void testStageThree(){
        BreakToWordsFactory breakToWordsFactory = new BreakToWordsFactory();
        BreakToWords one = breakToWordsFactory.getStage("three");
        List<String> r =one.wordBreak("ilikesamsungmobileandmango");
        r.stream().forEach(System.out::println);
        List<String> result = Arrays.asList("i like sam sung mobile and man go ",
                "i like sam sung mobile and mango ",
                "i like samsung mobile and man go ",
                "i like samsung mobile and mango ");
        for(String s: result){
            Assert.isTrue(r.contains(s),"stage three test fail");
        }
    }

}
