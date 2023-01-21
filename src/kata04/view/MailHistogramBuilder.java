package kata04.view;

import kata04.model.Mail;
import kata04.model.Histogram;
import java.util.List;

public class MailHistogramBuilder extends Histogram{

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram <String> histogram = new Histogram();
        for (Mail mail: mailList){
            histogram.increment(mail.getDomain());
        }     
        return histogram;
    }
    
}
