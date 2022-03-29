package ru.vsu.cs.tdo;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое время:");
        String time1 = scanner.nextLine();
        System.out.println("Введите второе время:");
        String time2 = scanner.nextLine();

        DateTime dateTime1 = new DateTime(time1);
        DateTime dateTime2 = new DateTime(time2);

        System.out.println(dateTime2.equalsTime(dateTime1));

        dateTime1.increaseSecond(-30);
        dateTime2.increaseSecond(-30);
        //dateTime1.increaseMinute(-10);
        //dateTime2.increaseMinute(-10);
        //dateTime1.increaseHour(-12);
        //dateTime2.increaseHour(-12);
        //dateTime1.increaseSecond(15);
        //dateTime2.increaseSecond(15);
        //dateTime1.increaseMinute(15);
        //dateTime2.increaseMinute(15);
        //dateTime1.increaseHour(9);
        //dateTime2.increaseHour(9);


        time1 = dateTime1.toStringTime2();
        time2 = dateTime2.toStringTime2();
        //time1 = dateTime1.toStringTime();
        //time2 = dateTime2.toStringTime();

        System.out.println(time1);
        System.out.println(time2);
    }
}