package com.company.epam.introduction_to_java_online.tasks.task2;



import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note implements Comparable<Note> {
    transient public static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private String topic;
    private Date date;
    private String eMail;
    private String message;

    public Note(String topic, String eMail, String message) {
        this.topic = topic;
        this.date = new Date();
        this.eMail = emailValidation(eMail);
        this.message = message;
    }

    public Note() {
        this.topic = "default";
        this.date = new Date();
        this.eMail = "default";
        this.message = "default";
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMassage() {
        return message;
    }

    public void setMassage(String massage) {
        this.message = massage;
    }
    public String emailValidation (String email){
        Matcher m = EMAIL_PATTERN.matcher(email);
        if(m.find()){
            return email;
        }
        else {
            while (true) {
                System.out.println("error. enter email in correct form");
                Scanner scanner = new Scanner(System.in);
                String temp = scanner.nextLine();
                Matcher m2 = EMAIL_PATTERN.matcher(temp);
                if(m2.find()){
                    return temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "topic: " + topic +
                "\ndate: " + date +
                "\neMail: " + eMail +
                "\nmassage: " + message;
    }


    @Override
    public int compareTo(Note o) {
        return this.date.compareTo(o.getDate());
    }
}
