/*
 * Subject 
 * 
 */
package visits;

/**
 * 
 * @author Carter Zenk
 */
public class Subject {
    
    private int subjectNumber;
    private int visitNumber;
    private String visitDate;
    private Visit visit;
    private Demographics demographics;
    
    
    
    public Subject() {
        this.demographics = new Demographics();
        this.visit = new Visit();
    }

    /**
     * @return the subjectNumber
     */
    public int getSubjectNumber() {
        return subjectNumber;
    }

    /**
     * @return the visitNumber
     */
    public int getVisitNumber() {
        return visitNumber;
    }

    /**
     * @param subjectNumber the subjectNumber to set
     */
    public void setSubjectNumber(int subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    /**
     * @param visitNumber the visitNumber to set
     */
    public void setVisitNumber(int visitNumber) {
        this.visitNumber = visitNumber;
    }

    /**
     * @return the visitDate
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * @param visitDate the visitDate to set
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * @return the visit
     */
    public Visit getVisit() {
        return visit;
    }

    /**
     * @return the demographics
     */
    public Demographics getDemographics() {
        return demographics;
    }
}
