package kata4.view;

import kata4.model.Histogram;
import kata4.model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mailList){
        Histogram<String> histo = new Histogram<>();
        mailList.forEach(e -> histo.increment(e.getDomain()));
        return histo;
    }
}
