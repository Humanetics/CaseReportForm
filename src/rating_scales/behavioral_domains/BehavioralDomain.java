/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rating_scales.behavioral_domains;

/**
 *
 * @author carterzenk
 */
public class BehavioralDomain {
    
    private int frequency;
    private int severity;
    private int total;
    
    public BehavioralDomain() {     
    }

    /**
     * @return the frequency
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    /**
     * @return the severity
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * @param severity the severity to set
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
