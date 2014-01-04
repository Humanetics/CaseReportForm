/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import visits.*;

/**
 *
 * @author carterzenk
 */
public class WriteText {
    
    public Subject subject;
    
    public WriteText(Subject subject) {
        this.subject = subject;
    }
    
    public void makeFile() throws IOException {
        this.subject = subject;
        File file = new File("/Users/carterzenk/Desktop/output.txt");
        Writer output = new BufferedWriter(new FileWriter(file));
        output.write("Case Report Form\n\n");
        output.write("Subject Number: " + subject.getSubjectNumber() + "\n");
        output.write("Visit Number: " + subject.getVisitNumber() + "\n");
        output.write("Visit Date: " + subject.getVisitDate() + "\n\n");
        output.write("Demographics\n");
        output.write("Date of Birth: " + subject.getDemographics().getDateOfBirth() +"\n");
        output.write("Sex: " + subject.getDemographics().getSex() +"\n");
        output.write("Race: " + subject.getDemographics().getRace() +"\n");
        output.write("Ethnicity: " + subject.getDemographics().getEthnicity() +"\n");
        output.close();
    }
    
}
