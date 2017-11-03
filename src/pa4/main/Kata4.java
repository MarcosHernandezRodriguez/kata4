/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import pa4.model.Histogram;
import pa4.model.Mail;
import pa4.view.HistogramDisplay;
import pa4.view.MailHistogramBuilder;
import pa4.view.MailListReader;

/**
 *
 * @author Marcos
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String filename = "C:\\Users\\Marcos\\Documents\\NetBeansProjects\\Kata4\\src\\emails.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
