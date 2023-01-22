package kata5p2.view;

import kata5p2.model.Mail;
import kata5p2.model.Histogram;
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
