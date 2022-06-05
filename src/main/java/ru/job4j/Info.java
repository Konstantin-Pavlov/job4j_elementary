package ru.job4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}