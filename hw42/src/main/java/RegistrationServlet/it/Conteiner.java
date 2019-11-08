package it;


import java.util.ArrayList;

public class Conteiner {
    static StringBuilder builder = new StringBuilder();
    private int i = 0;
    private ArrayList<String> loginAr = new ArrayList<>();
    private ArrayList<String> passwordAr = new ArrayList<>();
    private ArrayList<String> genderAr = new ArrayList<>();
    private ArrayList<String> phoneAr = new ArrayList<>();
    private ArrayList<String> emailAr = new ArrayList<>();
    private ArrayList<String> subscribeAr = new ArrayList<>();

     void push(String login, String password, String gender, String phone, String email, String subscribe){
        i++;
        loginAr.add(login);
        passwordAr.add(password);
        genderAr.add(gender);
        phoneAr.add(phone);
        emailAr.add(email);
        subscribeAr.add(subscribe);
        builder.append("<tr>" +
                "<td>" +
                i +
                "</td>" +
                "<td>" +
                loginAr.get(i - 1) +
                "</td>" +
                "<td>" +
                passwordAr.get(i - 1) +
                "</td>" +
                "<td>" +
                genderAr.get(i - 1) +
                "</td>" +
                "<td>" +
                phoneAr.get(i - 1) +
                "</td>" +
                "<td>" +
                emailAr.get(i - 1) +
                "</td>" +
                "<td>" +
                subscribeAr.get(i - 1) +
                "</td>" +
                "</tr>");
    }


}
