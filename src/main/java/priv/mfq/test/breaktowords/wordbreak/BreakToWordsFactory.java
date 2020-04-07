package priv.mfq.test.breaktowords.wordbreak;

public class BreakToWordsFactory {

    public BreakToWords getStage(String stage){
        if (stage == null){
            return null;
        }
        switch (stage){
            case "one":
                return new StageOne();
            case "two":
                return new StageTwo();
            case "three":
                return new StageThree();
            default:
                return null;

        }

    }
}
