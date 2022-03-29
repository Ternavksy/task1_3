package ru.vsu.cs.tdo;

public class DateTime {
    public int time;


    public DateTime(String time) {
        String[] timeStr = time.split("[:]");
        int[] timeInt = new int[3];

        for (int i = 0; i < 3; i ++) {
            timeInt[i] = Integer.parseInt(timeStr[i]);
        }

        this.time = timeInt[0] * 60 * 60 + timeInt[1] * 60 + timeInt[2];
    }

    public String toStringTime1() {
        int timeClone = this.time;
        int[] timeInt = new int[3];
        timeInt[0] = timeClone / (60 * 60);
        timeInt[1] = (timeClone % (60 * 60)) / 60;
        timeInt[2] = timeClone % 60;
        String[] timeStr = new String[3];

        for (int i = 0; i < 3; i ++) {
            timeStr[i] = Integer.toString(timeInt[i]);
        }

        for (int i = 0; i < 3; i ++) {
            if (timeStr[i].length() == 1) {
                timeStr[i] = "0" + timeStr[i];
            }
        }

        return timeStr[0] + "." + timeStr[1] + "." + timeStr[2];
    }

    public String toStringTime2() {
        int timeClone = this.time;
        int[] timeInt = new int[3];
        timeInt[0] = timeClone / (60 * 60);
        timeInt[1] = (timeClone % (60 * 60)) / 60;
        timeInt[2] = timeClone % 60;
        String[] timeStr = new String[3];

        for (int i = 0; i < 3; i ++) {
            timeStr[i] = Integer.toString(timeInt[i]);
        }

        for (int i = 0; i < 3; i ++) {
            if (timeStr[i].length() == 1) {
                timeStr[i] = "0" + timeStr[i];
            }
        }

        return timeStr[0] + ":" + timeStr[1] + ":" + timeStr[2];
    }

    public boolean equalsTime(DateTime dateTime) {
        return this.time == dateTime.time;
    }

    public void increaseSecond(int number) {
        this.time += number;
    }

    public void increaseMinute(int number) {
        this.time += number * 60;
    }

    public void increaseHour(int number) {
        this.time += number * 60 * 60;
    }
}

