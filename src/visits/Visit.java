package visits;
import rating_scales.*;

/**
 *
 * @author Carter Zenk
 */
public class Visit {
    
    private VitalSigns vitalSigns;
    private ADAS_COG adas_cog;
    private ADCS_ADL adcs_adl;
    private ADCS_CGIS adcs_cgis;
    private MMSE mmse;
    private NPI npi;
    
    public Visit() {
        this.vitalSigns = new VitalSigns();
        this.adas_cog = new ADAS_COG();
        this.adcs_adl = new ADCS_ADL();
        this.adcs_cgis = new ADCS_CGIS();
        this.mmse = new MMSE();
        this.npi = new NPI();
    }

    /**
     * @return the vitalSigns
     */
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    /**
     * @return the adas_cog
     */
    public ADAS_COG getAdas_cog() {
        return adas_cog;
    }

    /**
     * @return the adcs_adl
     */
    public ADCS_ADL getAdcs_adl() {
        return adcs_adl;
    }

    /**
     * @return the adcs_cgis
     */
    public ADCS_CGIS getAdcs_cgis() {
        return adcs_cgis;
    }

    /**
     * @return the mmse
     */
    public MMSE getMmse() {
        return mmse;
    }

    /**
     * @return the npi
     */
    public NPI getNpi() {
        return npi;
    }
    
}
