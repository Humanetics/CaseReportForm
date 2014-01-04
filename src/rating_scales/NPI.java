/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rating_scales;

import rating_scales.behavioral_domains.*;

/**
 *
 * @author carterzenk
 */
public class NPI extends RatingScale {
    
    private AberrantMotorBehavior aberrantMotorBehavior;
    private Agitation agitation;
    private Anxiety anxiety;
    private Apathy apathy;
    private Delusions delusions;
    private Depression depression;
    private Disinhibition disinhibition;
    private Elation elation;
    private Hallucinations hallucinations;
    private Irritability irritability;
    
    public NPI() {
        this.aberrantMotorBehavior = new AberrantMotorBehavior();
        this.agitation = new Agitation();
        this.anxiety = new Anxiety();
        this.apathy = new Apathy();
        this.delusions = new Delusions();
        this.depression = new Depression();
        this.disinhibition = new Disinhibition();
        this.elation = new Elation();
        this.hallucinations = new Hallucinations();
        this.irritability = new Irritability();
    }

    /**
     * @return the aberrantMotorBehavior
     */
    public AberrantMotorBehavior getAberrantMotorBehavior() {
        return aberrantMotorBehavior;
    }

    /**
     * @param aberrantMotorBehavior the aberrantMotorBehavior to set
     */
    public void setAberrantMotorBehavior(AberrantMotorBehavior aberrantMotorBehavior) {
        this.aberrantMotorBehavior = aberrantMotorBehavior;
    }

    /**
     * @return the agitation
     */
    public Agitation getAgitation() {
        return agitation;
    }

    /**
     * @param agitation the agitation to set
     */
    public void setAgitation(Agitation agitation) {
        this.agitation = agitation;
    }

    /**
     * @return the anxiety
     */
    public Anxiety getAnxiety() {
        return anxiety;
    }

    /**
     * @param anxiety the anxiety to set
     */
    public void setAnxiety(Anxiety anxiety) {
        this.anxiety = anxiety;
    }

    /**
     * @return the apathy
     */
    public Apathy getApathy() {
        return apathy;
    }

    /**
     * @param apathy the apathy to set
     */
    public void setApathy(Apathy apathy) {
        this.apathy = apathy;
    }

    /**
     * @return the delusions
     */
    public Delusions getDelusions() {
        return delusions;
    }

    /**
     * @param delusions the delusions to set
     */
    public void setDelusions(Delusions delusions) {
        this.delusions = delusions;
    }

    /**
     * @return the depression
     */
    public Depression getDepression() {
        return depression;
    }

    /**
     * @param depression the depression to set
     */
    public void setDepression(Depression depression) {
        this.depression = depression;
    }

    /**
     * @return the disinhibition
     */
    public Disinhibition getDisinhibition() {
        return disinhibition;
    }

    /**
     * @param disinhibition the disinhibition to set
     */
    public void setDisinhibition(Disinhibition disinhibition) {
        this.disinhibition = disinhibition;
    }

    /**
     * @return the elation
     */
    public Elation getElation() {
        return elation;
    }

    /**
     * @param elation the elation to set
     */
    public void setElation(Elation elation) {
        this.elation = elation;
    }

    /**
     * @return the hallucinations
     */
    public Hallucinations getHallucinations() {
        return hallucinations;
    }

    /**
     * @param hallucinations the hallucinations to set
     */
    public void setHallucinations(Hallucinations hallucinations) {
        this.hallucinations = hallucinations;
    }

    /**
     * @return the irritability
     */
    public Irritability getIrritability() {
        return irritability;
    }

    /**
     * @param irritability the irritability to set
     */
    public void setIrritability(Irritability irritability) {
        this.irritability = irritability;
    }

}