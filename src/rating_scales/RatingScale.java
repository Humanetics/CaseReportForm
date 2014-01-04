/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rating_scales;

/**
 *
 * @author carterzenk
 */
public class RatingScale {
    
    private boolean performed;
    private String date;
    private String comments;
    
    public RatingScale() {
    }

    /**
     * @return the performed
     */
    public boolean isPerformed() {
        return performed;
    }

    /**
     * @param performed the performed to set
     */
    public void setPerformed(boolean performed) {
        this.performed = performed;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
}
