package edu.javatutorials.javadevmustknow._20___other.JavaMailApi;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;


public class SendJuniorJavaCv {
    // Sender's email ID needs to be mentioned
    private static final String SEND_FROM_EMAIL = "Dmitry Samsonov <dmitry.samsonov.alexandrovich@gmail.com>";
    private static final String USERNAME;
    private static final String PASSWORD;
    static {
        Scanner scanner = null;
        String username = "";
        String password = "";
        try {
            scanner = new Scanner(new File("C://gmail/login_password.txt"));
            if (scanner.hasNextLine()) {
                username = scanner.nextLine();
            }
            if (scanner.hasNextLine()) {
                password = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        USERNAME = username;
        PASSWORD = password;
    }

    public static void main(String[] args) {

        // Recipient's email ID needs to be mentioned.
        String sendToEmail = "dima.samsonov7@gmail.com";

        String subject = "Junior Java Developer. Dmitry Samsonov";

        String projectPath = System.getProperty("user.dir");
        String messageText = getMessageFromCoverLetter(projectPath);

        String filePath = projectPath + "/cv/Dmitry_Samsonov_Junior_Java_CV.pdf";

        sendMessageToEmail(sendToEmail, subject, messageText, filePath);
    }

    private static String getMessageFromCoverLetter(String projectPath){
        StringBuilder message = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(projectPath + "/cv/Cover_Letter.txt"))) {
            String line = br.readLine();

            while (line != null) {
                message.append(line);
                message.append(System.lineSeparator());
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return message.toString();
    }

    private static void sendMessageToEmail(String sendToEmail, String subject, String messageText, String filePath) {
        Session session = getSession();

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

//            message.setRecipient(Message.RecipientType.BCC);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(SEND_FROM_EMAIL));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(sendToEmail));

            // Set Subject: header field
            message.setSubject(subject);

            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
            messageBodyPart.setText(messageText);

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(filePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Dmitry_Samsonov_Junior_Java_CV.pdf");
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);



            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private static Session getSession() {
        // Assuming you are sending email through smtp.gmail.com
        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        return Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });
    }
}
