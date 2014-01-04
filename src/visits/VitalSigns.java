/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visits;

/**
 *
 * @author carterzenk
 */
public class VitalSigns {
    public enum TemperatureType {
        TYPMANIC, ORAL
    }
    public enum SiteUsed {
        RIGHT_ARM, LEFT_ARM
    }
    public enum TemperatureUnit {
        C, F
    }
    public enum HeightUnit {
        Inches, cm
    }
    public enum WeightUnit {
        LB, KG
    }
    
    private SiteUsed siteUsed;
    private double systolicBP;
    private double diastolicBP;
    private double sittingPulse;
    private double respiration;
    private double bodyMassIndex;
    private double temperature;
    private double weight;
    private double height;
    
    public VitalSigns() {
    }

    /**
     * @return the diastolicBP
     */
    public double getDiastolicBP() {
        return diastolicBP;
    }

    /**
     * @param diastolicBP the diastolicBP to set
     */
    public void setDiastolicBP(double diastolicBP) {
        this.diastolicBP = diastolicBP;
    }

    /**
     * @return the siteUsed
     */
    public SiteUsed getSiteUsed() {
        return siteUsed;
    }

    /**
     * @param siteUsed the siteUsed to set
     */
    public void setSiteUsed(SiteUsed siteUsed) {
        this.siteUsed = siteUsed;
    }

    /**
     * @return the sittingBP
     */
    public double getSystolicBP() {
        return systolicBP;
    }

    /**
     * @param sittingBP the sittingBP to set
     */
    public void setSystolicBP(double sistolicBP) {
        this.systolicBP = systolicBP;
    }

    /**
     * @return the sittingPulse
     */
    public double getSittingPulse() {
        return sittingPulse;
    }

    /**
     * @param sittingPulse the sittingPulse to set
     */
    public void setSittingPulse(double sittingPulse) {
        this.sittingPulse = sittingPulse;
    }

    /**
     * @return the respiration
     */
    public double getRespiration() {
        return respiration;
    }

    /**
     * @param respiration the respiration to set
     */
    public void setRespiration(double respiration) {
        this.respiration = respiration;
    }

    /**
     * @return the bodyMassIndex
     */
    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    /**
     * @param bodyMassIndex the bodyMassIndex to set
     */
    public void setBodyMassIndex(double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     * @param weightUnit LB or KG
     */
    public void setWeight(double weight, WeightUnit weightUnit) {
        switch(weightUnit) {
            case KG:
                this.weight = weight*2.2046;
                break;
                
            case LB:
                this.weight = weight; //Convert fahrenheit to celcius
                break;
        }
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     * @param heightUnit Inches or cm
     */
    public void setHeight(double height, HeightUnit heightUnit) {
        switch(heightUnit) {
            case Inches:
                this.height = height;
                break;
                
            case cm:
                this.height = height*0.393700787; //Convert cm to Inches
                break;
        }
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temp the temperature to set
     * @param tempUnits C or F (Celcius or Fahrenheit)
     */
    public void setTemperature(double temp, TemperatureUnit tempUnit) {
        switch(tempUnit) {
            case C:
                this.temperature = (temp*1.8)+32; //Convert celcius to fahrenheit
                break;
                
            case F:
                this.temperature = temp;
                break;
        }
    }
    
    
    
}
