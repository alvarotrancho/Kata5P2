package kata5p2.main;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;

public class kata5p2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:KATA05.db");
            Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery("SELECT mail FROM email");
            List<Mail> mailList = new ArrayList<>();
            
            while (result.next()) { 
                String email = result.getString("mail");
                mailList.add(new Mail(email));
                //System.out.println("Email: " +email);
            }
            Histogram<String> histogram = MailHistogramBuilder.build(mailList);
            
            HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
            histogramDisplay.execute();
        }
    }
}