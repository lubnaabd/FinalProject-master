package com.twins.osama.finalproject.Class;

/**
 * Created by osama on 19/9/2017.
 */

public class RVDeadline {
    public  String Resone;
    public String Date;

    public String houer;

    public RVDeadline(String resone, String date, String houer) {
        Resone = resone;
        Date = date;
        this.houer = houer;
    }

    public void setResone(String resone) {
        Resone = resone;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setHouer(String houer) {
        this.houer = houer;
    }

    public String getResone() {
        return Resone;

    }

    public String getDate() {
        return Date;
    }

    public String getHouer() {
        return houer;
    }
}
