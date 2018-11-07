package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Kata4 {

    private List<Mail> mailList;
    private Histogram<String> histogram;

    public static void main(String[] args) {
        new Kata4().control();
    }

    private void control(){
        input();
        process();
        output();
    }

    private void input(){
        String filename = "email.txt";
        mailList = new MailListReader()
                .read(filename);
    }

    private void process(){
        histogram = new MailHistogramBuilder()
                .build(mailList);
    }

    private void output(){
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }

}
