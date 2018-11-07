package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Kata4 {
    public static void main(String[] args) {
        String fileName = "email.txt";
        List<Mail> mailList = new MailListReader()
                .read(fileName);
        Histogram<String> histogram = new MailHistogramBuilder()
                .build(mailList);
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
