package kata5p2.main;

import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;
import kata5p2.view.HistogramDisplay;
import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import java.util.List;

public class kata5p2 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
}