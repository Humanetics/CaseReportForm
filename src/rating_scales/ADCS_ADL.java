package rating_scales;

/**
 * @author Carter Zenk
 */
public class ADCS_ADL extends RatingScale{
    
    private int totalScore;
    private int dontKnowResponses;
    
    public ADCS_ADL() {
    }

    /**
     * @return the totalScore
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * @return the dontKnowResponses
     */
    public int getDontKnowResponses() {
        return dontKnowResponses;
    }

    /**
     * @param dontKnowResponses the dontKnowResponses to set
     */
    public void setDontKnowResponses(int dontKnowResponses) {
        this.dontKnowResponses = dontKnowResponses;
    }
  
}
