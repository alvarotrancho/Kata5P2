package kata04.main;

import kata04.view.MailHistogramBuilder;
import kata04.view.MailListReader;
import kata04.view.HistogramDisplay;
import kata04.model.Mail;
import kata04.model.Histogram;
import java.util.List;

public class Kata04 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
}